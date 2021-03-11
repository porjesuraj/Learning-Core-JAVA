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
		
		try(Connection connection = DbUtils.getConnection();
				Statement statement = connection.createStatement();){
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "delete from books where book_id=1026";
			int count = statement.executeUpdate(sql);
			
			System.out.println(count+" row(s) affected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static void main3(String[] args) {
		
		try(Connection connection = DbUtils.getConnection();
				Statement statement = connection.createStatement();){
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "update books set price = 5000 where book_id=1026";
			int count = statement.executeUpdate(sql);
			
			System.out.println(count+" row(s) affected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
public static void main2(String[] args) {
		
		try(Connection connection = DbUtils.getConnection();
				Statement statement = connection.createStatement();){
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "INSERT INTO books VALUES(1026,'OS','ABC','PQR',450)";
			int count = statement.executeUpdate(sql);
			
			System.out.println(count+" row(s) affected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static void main1(String[] args) {
		
		try(Connection connection = DbUtils.getConnection();
				Statement statement = connection.createStatement();){
			//Step 4 : Create and execute query[ dml : executeUpdate, dql : executeQuery]
			String sql = "SELECT * FROM books";
			ResultSet rs = statement.executeQuery(sql);
			
			while( rs.next()) {
				Program.printRow( rs );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
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
