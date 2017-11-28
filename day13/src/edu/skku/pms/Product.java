package edu.skku.pms;

public class Product {
	private int pnum;
	private String title;
	private int price;
	private int quant;
	
	public Product() {
		super();
	}

	public Product(int pnum, String title, int price, int quant){
		this.pnum =pnum;
		this.title= title;
		this.price = price;
		this.quant =quant;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		return "Product [pnum=" + pnum + ", title=" + title + ", price=" + price + ", quant=" + quant + "]";
	}
	
	
}
