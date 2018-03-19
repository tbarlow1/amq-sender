package com.crossvale.cxp.cmq.cmq;

import java.io.IOException;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component("myevaluator")
public class Evaluator {

    public Boolean evaluateStatus (String message){
    	
    	System.out.println("evaluating message...");
    	
    	Boolean result = Boolean.FALSE;
    	
    	ObjectMapper mapper = new ObjectMapper();
        try {
			Customer customer = mapper.readValue((String) message, Customer.class);
			if (!customer.getStatus().equals("Expired")) {
				result = Boolean.TRUE;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return result;
    }
}