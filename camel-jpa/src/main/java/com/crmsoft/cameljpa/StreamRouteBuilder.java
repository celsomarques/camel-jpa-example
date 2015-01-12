package com.crmsoft.cameljpa;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class StreamRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        from("stream:in?promptMessage=Enter your name to save on database: ").beanRef("com.crmsoft.cameljpa.PersonDao", "create");
    }
}