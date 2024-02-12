package zuci.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		Team team=ac.getBean("t1",Team.class);
		team.showTeam();
	}
}
