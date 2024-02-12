package zuci.demo.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zuci.demo.Order;
import zuci.demo.Product;

@Configuration
public class Demo3ApplicationConfig {
	@Bean(name = "p1")
	public Product product() {
		return new Product();
	}
	@Bean(name="o1")
	public Order order() {
		return new Order();
	}
	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}
	
}
