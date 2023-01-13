package assignment2;

public class BOOK {

	private int id;
	private String title;
	private String author;
	private double price;
	
	BOOK(int i,String t,String a,double p)
	{
		this.id=i;
		this.title=t;
		this.author=a;
		this.price=p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
