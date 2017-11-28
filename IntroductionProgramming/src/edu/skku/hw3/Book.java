package edu.skku.hw3;

public class Book {
	private String isbn, title, author, publisher, desc;
	private int price;
	private String list="";
	
	public Book(){}
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher= publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public Book(String isbn, String title, String author, String publisher, int price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher= publisher;
		this.price = price;
		this.desc = "";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		System.out.printf("%-8s| %-13s| %-5s| %-15s| %-6d| %-30s\n",getIsbn(),getTitle(),getAuthor(),getPublisher(),getPrice(),getDesc());
		
		return "collect";
	}
	
	
}
