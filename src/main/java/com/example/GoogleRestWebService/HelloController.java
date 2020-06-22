package com.example.GoogleRestWebService;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	Logger logger = LoggerFactory.getLogger(HelloController.class);
	  @RequestMapping("/hello")
	  public String hello() {
	    StringBuilder message = new StringBuilder("Hello Google App Engine! from uday orsu");
	    try {
	      InetAddress ip = InetAddress.getLocalHost();
			logger.info("Ip address is coming from" + ip);
	      message.append(" From host: " + ip);
	    } catch (UnknownHostException e) {
	      e.printStackTrace();
	    }
	      return message.toString();
	    }

}
