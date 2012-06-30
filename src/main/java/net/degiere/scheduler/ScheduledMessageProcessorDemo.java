package net.degiere.scheduler;

import net.degiere.config.AppConfig;
import net.degiere.config.ScheduleConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduledMessageProcessorDemo {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfig.class, ScheduleConfig.class);
    }

}
