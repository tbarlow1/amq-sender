package com.crossvale.cxp.cmq.cmq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class MQSender extends RouteBuilder {
	

    @Override
    public void configure() throws Exception {
    	
    	NewCustomerProcessor newCustomerBean = new NewCustomerProcessor();
        
        from("timer:test?period=5000")
        .log("Sending a message")
        .bean(newCustomerBean, "process")
        .to("activemq:testqueue");
		
    }
}