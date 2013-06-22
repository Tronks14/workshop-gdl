package com.recluit.lab.action;

import java.util.Scanner;

import com.opensymphony.xwork2.ActionSupport;
import com.recluit.lab.restclient.BookRestClient;

public class BookAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bookQuery;
	private String bookResult;
	private String bookResultTitle;
	private String bookResultAuthor;
	
	public String execute() throws Exception {
		BookRestClient bookResultClient = new BookRestClient();
		bookResult = bookResultClient.findBookByTitle(bookQuery);
			if(bookResult != null){
				Scanner scanner = new Scanner(bookResult);
				scanner.useDelimiter(",");
				bookResultTitle = scanner.next();
				bookResultAuthor = scanner.next();
				scanner.close();
				return SUCCESS;
			}else {return ERROR;}
	}

	/*public BookStore getBookStore() {
		return bookStore;
	}

	public void setBookStore(BookStore bookStore) {
		this.bookStore = bookStore;
	}
*/
	public String getBookQuery() {
		return bookQuery;
	}

	public void setBookQuery(String bookQuery) {
		this.bookQuery = bookQuery;
	}

	public String getBookResultAuthor() {
		return bookResultAuthor;
	}

	public void setBookResultAuthor(String bookResultAuthor) {
		this.bookResultAuthor = bookResultAuthor;
	}

	public String getBookResultTitle() {
		return bookResultTitle;
	}

	public void setBookResultTitle(String bookResultTitle) {
		this.bookResultTitle = bookResultTitle;
	}
	
	
}
