package jmx.client;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import jmx.service.Hello;


public class JMXClient {

	/**
	 * @throws InterruptedException 
	 * @throws NotCompliantMBeanException 
	 * @throws MBeanRegistrationException 
	 * @throws InstanceAlreadyExistsException 
	 * @throws NullPointerException 
	 * @throws MalformedObjectNameException  
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args     
	 * @return void     
	 * @throws 
	 */

	public static void main(String[] args) throws MalformedObjectNameException, NullPointerException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException, InterruptedException {
		// TODO Auto-generated method stub
		// Get the Platform MBean Server  
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		
		//Construct the ObejctName for the MBean we will register
		ObjectName name = new ObjectName("jmx.service:type=Hello");
		
		 // Create the Hello World MBean  
	    Hello mbean = new Hello();  
	  
	    // Register the Hello World MBean  
	    mbs.registerMBean(mbean, name); 
	    
	    // Wait forever  
	    System.out.println("Waiting forever...");  
	    Thread.sleep(Long.MAX_VALUE); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
