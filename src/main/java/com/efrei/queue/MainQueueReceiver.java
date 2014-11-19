package com.efrei.queue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQueueReceiver {

	public static void main(String[] args) {
		
		try{
		
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextJMS.xml");

			AQueueReceiver receiver = (AQueueReceiver) applicationContext.getBean("queueReceiver");
		
			Thread.sleep(10000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
