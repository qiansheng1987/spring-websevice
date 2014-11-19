package schedule.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringClient {
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("schedule/spring-schedule.xml");
	}
}
