package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DbUtils;

public class Program {
	//com.mysql.cj.jdbc.Driver
	
	
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection =  DbUtils.getConnection(); 
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
