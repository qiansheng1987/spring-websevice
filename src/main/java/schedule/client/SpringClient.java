package schedule.client;

import java.io.IOException;

import mx4j.tools.adaptor.http.HttpAdaptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringClient {
	public static void main(String[] args) throws IOException {
		  ApplicationContext context = new ClassPathXmlApplicationContext("schedule/spring-schedule.xml");
		  HttpAdaptor httpAdaptor = (HttpAdaptor) context.getBean("httpAdaptor");  
	      httpAdaptor.start();  
	}
}
