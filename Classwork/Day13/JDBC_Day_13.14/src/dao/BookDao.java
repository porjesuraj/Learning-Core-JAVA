package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DbUtils;

public class BookDao  implements Closeable{
	
	Connection connection = null;
	Statement statement = null;
	
	public BookDao() throws ClassNotFoundException, SQLException {
	
		this.connection = DbUtils.getConnection();
		this.statement = this.connection.createStatement(); 
		
	}
	
	public int Insert(Book book ) throws SQLException {
		
		String sql = "insert into books values("+book.getBookId()+",'"+book.getSubjectName()+"','"+ book.getBookName()+"','"+book.getAuthorName()+"',"+book.getPrice()+")";
		
		return this.statement.executeUpdate(sql);
	}
	public int update(int bookId, float price) throws Exception{
		String sql = "UPDATE books SET price="+price+" WHERE book_id="+bookId+"";
		return this.statement.executeUpdate(sql);
	}
	
	public int delete(int bookId) throws Exception{
		String sql = "DELETE FROM books WHERE book_id="+bookId+"";
		return this.statement.executeUpdate(sql);
	}
	
	public List<Book> getBooks( )throws Exception{
		String sql = "SELECT * FROM books";
		List<Book> books = new ArrayList<Book>();
		try( ResultSet rs = this.statement.executeQuery(sql) ){
			while( rs.next())
				books.add( new Book(rs.getInt("book_id"),rs.getString("subject_name"),rs.getString("book_name"),rs.getString("author_name"),rs.getFloat("price")) );
		}
		return books;
	}

	@Override
	public void close() throws IOException {
		try {
			
			connection.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
