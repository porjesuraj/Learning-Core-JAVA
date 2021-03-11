package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	//com.mysql.cj.jdbc.Driver
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Step 1 : Load and register driver
			Driver driver = new com.mysql.cj.jdbc.Driver(); // Upcasting
			DriverManager.registerDriver(driver);
			
			//Step 2 : Establish connection using users credential
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "dac", "password");
			
			//Step 3 : Create Statement
			statement = connection.createStatement();
			
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "SELECT * FROM books";
			ResultSet rs = statement.executeQuery(sql);
			
			/*while( rs.next()) {
				int bookId = rs.getInt(1);
				String subjectName = rs.getString(2);
				String bookName = rs.getString(3);
				String authorName = rs.getString(4);
				float price = rs.getFloat(5);
				System.out.printf("%-5d%-10s%-55s%-40s%-10.2f\n",bookId, subjectName, bookName, authorName, price);
			}*/
			/*while( rs.next()) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getNString("subject_name");
				String bookName = rs.getNString("book_name");
				String authorName = rs.getNString("author_name");
				float price = rs.getFloat("price");
				System.out.printf("%-5d%-10s%-55s%-40s%-10.2f\n",bookId, subjectName, bookName, authorName, price);
			}*/
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
		String subjectName = rs.getNString("subject_name");
		String bookName = rs.getNString("book_name");
		String authorName = rs.getNString("author_name");
		float price = rs.getFloat("price");
		System.out.printf("%-5d%-10s%-55s%-40s%-10.2f\n",bookId, subjectName, bookName, authorName, price);
	}
}
