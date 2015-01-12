package com.crmsoft.cameljpa;

import org.apache.camel.builder.RouteBuilder;

public class JpaRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("jpa:com.crmsoft.cameljpa.domain.Person?consumeDelete=false").to("stream:out");
	}
}