package com.subhen;

import org.apache.log4j.Logger;

public class DemoMain {
	static Logger log = Logger.getLogger(DemoMain.class.getName());
	
	public static void main(String[] args) {
		
		log.info("inside main method");
		
		try {
			int num = 100/0;
			
		}catch(Exception e) {
			log.error(e.getMessage());
		}
		int num = 100;
		int sum = num + 100;
		
		log.info("the addition of two numbers are: "+ sum);
	}


}
