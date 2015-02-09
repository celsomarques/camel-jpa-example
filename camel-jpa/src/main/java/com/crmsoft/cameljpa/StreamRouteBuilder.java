package com.crmsoft.cameljpa;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * A Camel Java DSL Router
 */
@Component
public class StreamRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        from("stream:in?promptMessage=Enter your name to save on database: ")
        	.log("After receive a message input")
        	.to("bean:personTransformer")
        	.log("After transformer")
        	.to("bean:personRepository?method=save")
        	.log("After save");
    }
}