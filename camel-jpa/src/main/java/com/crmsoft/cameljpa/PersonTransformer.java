package com.crmsoft.cameljpa;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.crmsoft.cameljpa.domain.Person;

@Component
public class PersonTransformer {

	@Handler
	public Person transform(Exchange exchange) {
		String name = exchange.getIn().getBody(String.class);
		
		Person person = new Person();
		person.setName(name);
		return person;
	}
}
