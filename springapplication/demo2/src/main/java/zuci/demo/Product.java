package zuci.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Product {
	
	public Order order;
	
	public void showProduct() {
		System.out.println("welcome to get product");
		order.displayOrder();
	}
	@Autowired
	public Product(Order order) {
		super();
		this.order = order;
	}
}
