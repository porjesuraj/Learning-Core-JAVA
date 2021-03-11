package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import test.Program;

public class DbUtils {

	public static final String Driver = "com.mysql.cj.jdbc.Driver"; 
	public static final String URL = "jdbc:mysql://localhost:3306/dac_db"; 
	public static final String USER = "dac"; 
	public static final String Password = "password"; 
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(Driver); 
		
		return DriverManager.getConnection(URL, USER, Password);
	}
	
	
}
