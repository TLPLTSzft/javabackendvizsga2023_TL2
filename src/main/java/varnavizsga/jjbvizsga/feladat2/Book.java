package varnavizsga.jjbvizsga.feladat2;

public class Book {
	
	private int id;
	private String author;
	private String title;
	private int price;
	private boolean onSale;

	public Book(int id, String author, String title, int price, boolean onSale) {
		this.id = id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.onSale = onSale;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isOnSale() {
		return onSale;
	}
	
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	
	public int getCurrentPrice() {
		return onSale ? this.price - (int) Math.floor(this.price * 15 / 100.0) : this.price;
	}
	
	@Override
	public String toString() {
		String string = String.format("%s: %d Ft", author + " - " + title, getCurrentPrice());
		return string;
	}
}
