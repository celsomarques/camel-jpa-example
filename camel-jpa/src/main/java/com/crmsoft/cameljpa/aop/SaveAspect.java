package com.crmsoft.cameljpa.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.crmsoft.cameljpa.EntityEvent;

@Aspect
@Component
public class SaveAspect {

	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Pointcut("execution(public !void org.springframework.data.repository.Repository+.save(..))")
	public void saveOfRepository(){
	}
	
	@AfterReturning(pointcut = "saveOfRepository()", returning = "entity")
	public void save(Object entity) {
		this.publisher.publishEvent(new EntityEvent(entity));
	}
}