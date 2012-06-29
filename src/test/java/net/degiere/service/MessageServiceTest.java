package net.degiere.service;

import junit.framework.Assert;
import net.degiere.config.AppConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageServiceTest {
	
	@Test
	public void getMessage() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = ctx.getBean(MessageService.class);
		Assert.assertNotNull(messageService.getMessage());
	}

}
