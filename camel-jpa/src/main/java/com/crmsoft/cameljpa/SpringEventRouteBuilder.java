package com.crmsoft.cameljpa;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SpringEventRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("spring-event:default")
			.log("Consuming message that was saved")
			.to("stream:out");
	}
}