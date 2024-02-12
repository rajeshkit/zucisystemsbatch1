package zuci.demo;

public class Product {
	private int productId;
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	private String productName;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public void getProduct() {
		System.out.println("welcome to get product");
	}
}
