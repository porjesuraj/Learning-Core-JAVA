package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.BookDao;
import pojo.Book;
import utils.DbUtils;

public class Program {

	

	public static void main4(String[] args) {
		try( BookDao dao = new BookDao()){
			int count = dao.delete( 1026);
			System.out.println(count+" row(s) affected");
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main3(String[] args) {
		try( BookDao dao = new BookDao()){
			int count = dao.update( 1026, 4500 );
			System.out.println(count+" row(s) affected");
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try( BookDao dao = new BookDao()){
			Book book = new Book(1026,"OS", "LPI", "Michael Kerrisk", 4999);
			int count = dao.Insert( book );
			System.out.println(count+" row(s) affected");
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		try(BookDao dao = new BookDao()) {
			List<Book> books = dao.getBooks();
			
			for(Book book : books)
			{
				System.out.println(book.toString());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
}
