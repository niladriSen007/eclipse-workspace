package assignment;

public class PRODUCT {

	private int ProductId;
	private String ProductName;
	private double Quantity;
	private double Price;
	
	PRODUCT(int p,String n,double q,double pr)
	{
		this.ProductId=p;
		this.ProductName=n;
		this.Quantity=q;
		this.Price=pr;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
}
