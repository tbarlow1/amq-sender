package com.crossvale.cxp.cmq.cmq;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;


@Component("notifyCustomerSupport")
public class MQConsumer {

    @Handler
    public void notifySupport(@Body String message) {
        System.out.println( "notifying customer support: ");

    }
}