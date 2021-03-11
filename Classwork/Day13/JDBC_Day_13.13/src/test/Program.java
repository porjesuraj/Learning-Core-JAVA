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

public class Program {
	//com.mysql.cj.jdbc.Driver

	
	public static void main(String[] args) {
		
		try(Connection connection = DbUtils.getConnection();
				Statement statement = connection.createStatement();){
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "SELECT * FROM books";
			ResultSet rs = statement.executeQuery(sql);
			
			List<Book> books = new ArrayList<>();
			
			while( rs.next()) 
				books.add( new Book(rs.getInt("book_id"),rs.getString("subject_name"),rs.getString("book_name"),rs.getString("author_name"),rs.getFloat("price")) );
			
			for(Book book : books)
			{
				System.out.println(book.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
