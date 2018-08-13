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
		dao.addBook(new Books("Twilight",500,1,"Part 1 of the Saga","Stephenie Meyer","Twilight.jpg"));	

		dao.addBook(new Books("New Moon",350,1,"Part 2 of the Saga","Stephenie Meyer","New Moon.jpg"));	

		dao.addBook(new Books("Eclipse",600,1,"Part 3 of the Saga","Stephenie Meyer","Eclipse.jpg"));	

		dao.addBook(new Books("Breaking Dawn Part 1",500,1,"Part 4 of the Saga","Stephenie Meyer","Breaking Dawn Part 1.jpg"));	

		dao.addBook(new Books("Breaking Dawn Part 2",700,1,"Part 5 of the Saga","Stephenie Meyer","Breaking Dawn Part 2.jpg"));	

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
