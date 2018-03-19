package com.crossvale.cxp.cmq.cmq;

import java.text.SimpleDateFormat;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class NewCustomerProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Customer customer = new Customer(1, "Tyler Tester");
		customer.setAddress(new Address("123 Fake Street","Suite 104","South Logan","Utah","84321","US","United States"));
		customer.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").parse("1990-12-25"));
		customer.setPhoneNr(new PhoneNr("mobile", "(801) 593-0897"));
		customer.setIssuePlace("Utah");
		customer.setStatus("Expired");
		customer.setExpirationDate(new SimpleDateFormat("yyyy-MM-dd").parse("2012-12-25"));
		customer.setIssueDate(new SimpleDateFormat("yyyy-MM-dd").parse("2007-05-01"));
		customer.setNationalityCode("US");
		customer.setEmail("ttester@crossvale.com");
		exchange.getIn().setBody(customer, Customer.class);

	}

}
