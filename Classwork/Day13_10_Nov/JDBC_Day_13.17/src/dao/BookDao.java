package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DbUtils;

public class BookDao  implements Closeable{
	
	Connection connection = null;
	
	PreparedStatement stmtInsert;
	PreparedStatement stmtUpdate;
	PreparedStatement stmtDelete;
	PreparedStatement stmtSelect;
	
	
	
	public BookDao() throws ClassNotFoundException, SQLException {
	
		this.connection = DbUtils.getConnection();
		
		this.stmtInsert = connection.prepareStatement("insert into books values(?,?,?,?,?)");
		this.stmtUpdate = connection.prepareStatement("update books set price=? where book_id=?");
		this.stmtDelete = connection.prepareStatement("delete from books where book_id=?");
        this.stmtSelect = connection.prepareStatement("select * from books");		
	}
	
	public int Insert(Book book ) throws SQLException {
		
		
		this.stmtInsert.setInt(1, book.getBookId());
		this.stmtInsert.setString(2, book.getSubjectName());
		this.stmtInsert.setString(3, book.getBookName());
		this.stmtInsert.setString(4, book.getAuthorName());
        this.stmtInsert.setFloat(5, book.getPrice());		
		
		return this.stmtInsert.executeUpdate();
	}
	public int update(int bookId, float price) throws Exception{
		
		this.stmtUpdate.setFloat(1, price);
        this.stmtUpdate.setInt(2, bookId);		
		
		
		return this.stmtUpdate.executeUpdate();
	}
	
	public int delete(int bookId) throws Exception{
		
		this.stmtDelete.setInt(1, bookId);
		
		
		return this.stmtDelete.executeUpdate();
	}
	
	public List<Book> getBooks( )throws Exception{
		
		List<Book> books = new ArrayList<Book>();
		try( ResultSet rs = this.stmtSelect.executeQuery() ){
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
