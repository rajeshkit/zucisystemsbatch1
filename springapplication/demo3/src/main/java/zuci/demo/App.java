package zuci.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import zuci.demo.config.Demo3ApplicationConfig;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        Order order=new Order();
//        Product product=new Product();
		ApplicationContext ac = 
				new AnnotationConfigApplicationContext(Demo3ApplicationConfig.class);
		Order order = ac.getBean(Order.class);
		order.getOrder();
		Product product = ac.getBean(Product.class);
		product.getProduct();
	}
}
