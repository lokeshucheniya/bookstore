package com.cg.books.service;

import java.util.Collection;

import com.cg.book.cart.CartList;
import com.cg.books.dao.BookDao;
import com.cg.books.dao.BookDaoImp;
import com.cg.books.pojo.Books;

public class BookServiceImp implements BookService{

	private BookDao dao = new BookDaoImp();
	private CartList cart= new CartList();
	
	@Override
	public void addNewBook() {
		dao.addBook(new Books("Sample5",100,1,"Samp5","Prod1"));	
		dao.addBook(new Books("Sample4",200,1,"Samp4","Prod1"));	
		dao.addBook(new Books("Sample3",300,1,"Samp3","Prod1"));	
		dao.addBook(new Books("Sample2",400,1,"Samp2","Prod1"));	
		dao.addBook(new Books("Sample1",500,1,"Samp1","Prod1"));	

	}

	@Override
	public Collection<Books> viewAllBooks() {
		
		return dao.viewAllBooks();
	}

	@Override
	public Books getBookByName(String bookName) {
		
		return dao.getBookByName(bookName);
	}
	
	public void addBooksToCart(String bookName)
	{
		
		cart.addBookToCart(bookName);
	}

	public Collection<Books> displayCart() {
		
		return cart.displayCart();
	}

	public void removeFromCart(String removedBook) {
		
		cart.removeFromCart(removedBook);
	}

	public int getCount()
	{
		return cart.getCount();
	}
}
