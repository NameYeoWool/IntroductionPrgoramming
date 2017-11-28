package edu.skku.hw3;

public class Magazine {
	private String isbn, title, author, publisher, desc;
	private int price, year, month;
	
	public Magazine(){}
	
	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year, int month){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher= publisher;
		this.price = price;
		this.desc = desc;
		this.year = year;
		this.month = month;
	}
	
	public Magazine(String isbn, String title, String author, String publisher, int price, int year, int month){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher= publisher;
		this.price = price;
		this.desc = "";
		this.year = year;
		this.month = month;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public String toString(){
		System.out.printf("%-8s| %-13s| %-5s| %-15s| %-6d| %-5s\t| %-4d.%d\n",getIsbn(),getTitle(),getAuthor(),getPublisher(),getPrice(),getDesc(),getYear(),getMonth());
		
		return "collect";
	}
	
	
	
	
}
