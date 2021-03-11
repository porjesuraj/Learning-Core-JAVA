package utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import test.Program;

public class DbUtils {

	private static Properties p;
	
	static {
		
		try {
			
			FileInputStream inputStream = new FileInputStream("Config.properties");
			
			p = new Properties();
			
			p.load(inputStream);
	        
			Class.forName(p.getProperty("DRIVER"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		return DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("Password"));
	}
	
	
}
