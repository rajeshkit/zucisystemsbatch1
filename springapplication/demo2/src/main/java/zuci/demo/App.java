package zuci.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        Order order=new Order();
//        Product product=new Product();
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		Product product = ac.getBean(Product.class);
		product.showProduct();
	}
}
