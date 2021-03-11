package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	//com.mysql.cj.jdbc.Driver
	
	public static final String Driver = "com.mysql.cj.jdbc.Driver"; 
	public static final String URL = "jdbc:mysql://localhost:3306/dac_db"; 
	public static final String USER = "dac"; 
	public static final String Password = "password"; 
	
	
	
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Step 1 : Load and register driver
		
			Class.forName(Program.Driver);
			
			//Step 2 : Establish connection using users credential
			connection = DriverManager.getConnection(Program.URL, Program.USER,Program.Password);
			
			//Step 3 : Create Statement
			statement = connection.createStatement();
			
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "SELECT * FROM books";
			ResultSet rs = statement.executeQuery(sql);
			
			while( rs.next()) {
				Program.printRow( rs );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//Step 5 : Close resources
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void printRow(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("book_id");
		String subjectName = rs.getString("subject_name");
		String bookName = rs.getString("book_name");
		String authorName = rs.getString("author_name");
		float price = rs.getFloat("price");
		System.out.printf("%-5d%-10s%-55s%-40s%-10.2f\n",bookId, subjectName, bookName, authorName, price);
	}
}
