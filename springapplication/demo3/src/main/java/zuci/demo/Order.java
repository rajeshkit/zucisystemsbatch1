package zuci.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Order {
	public void getOrder() {
		System.out.println("welcome to get order");
	}

}
