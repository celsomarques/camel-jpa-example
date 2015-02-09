package com.crmsoft.cameljpa;

import org.apache.camel.main.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    @SuppressWarnings("resource")
	public static void main(String... args) throws Exception {
    	
    	new ClassPathXmlApplicationContext("spring/application-context.xml");

        Main main = new Main();
        main.enableHangupSupport();
        main.run(args);
    }
}