package test;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
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
		try (Connection connection = DbUtils.getConnection(); 
				Statement statement = connection.createStatement();) {
			int bookId = 1025;
			String subjectName = "OS", bookName = "Operating System Concept's", authorName = "Galvin";
			float price = 575.50f;
			
			String sql = "INSERT INTO books VALUES("+bookId+",'"+subjectName+"','"+bookName+"','"+authorName+"',"+price+")";
			//String sql = "INSERT INTO books VALUES(1025,'OS','Operating System Concept's','Galvin',575.50)";
			int count = statement.executeUpdate(sql);
			System.out.println(count+" row(s) affected." );

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

            