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

public class Program {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DbUtils.getConnection( );
			connection.setAutoCommit(false);	//Step No 1
			statement = connection.createStatement();
		
		

			
			String sql1 = "UPDATE accounts SET balance = balance - 10000 WHERE accno=1001"; 
			statement.executeUpdate(sql1);
			
			int a = 10, b = 0, c ;
		//	c = a / b;	//ArithmeticException
			
			String sql2 = "UPDATE accounts SET balance = balance + 10000 WHERE accno=1002";
			statement.executeUpdate(sql2);
			
			System.out.println("done");
			connection.commit();	//Step No 2;
		}catch( Exception ex ) {
			try {
				System.out.println("not done");
				connection.rollback();
				ex.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
    