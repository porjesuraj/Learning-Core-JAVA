package test;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DbUtils;

//statement : compile each time , cant handle special character
public class Program {
	public static void main(String[] args) {
		//String sql = "INSERT INTO books (book_id, subject_name, book_name, author_name, price ) VALUES(?,?,?,?,?)";	//Parameterized query => ? IN parameter placeholders		
		//String sql = "insert into books values(?,?,?,?,?)"; 
		
		String sql = "{call sp_insert_book(?,?,?,?,?)}"; 
		try (Connection connection = DbUtils.getConnection(); 
				CallableStatement statement = connection.prepareCall(sql);) {
			int bookId = 1030;
			String subjectName = "OS", bookName = "Operating System Concept's", authorName = "Galvin";
			float price = 575.50f;
			
			statement.setInt(1, bookId);
	        statement.setString(2, subjectName);
	        statement.setString(3, bookName);
	        statement.setString(4, authorName);
	        statement.setFloat(5, price);
	        
	        boolean result = statement.execute();
	        
	        if(result == false)
	        {
	        	int count = statement.getUpdateCount();
				System.out.println(count+" row(s) affected." );
	        }
	        
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

            