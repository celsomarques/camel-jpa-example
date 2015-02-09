package com.crmsoft.cameljpa;

import org.springframework.context.ApplicationEvent;

public class EntityEvent extends ApplicationEvent {

	private static final long serialVersionUID = 6135498109617521759L;

	public EntityEvent(Object source) {
		super(source);
	}

}