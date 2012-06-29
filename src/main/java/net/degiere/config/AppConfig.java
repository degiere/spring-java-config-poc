package net.degiere.config;

import net.degiere.service.MessageService;
import net.degiere.service.MessageServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:/META-INF/spring/application.properties")
public class AppConfig {
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
 
    public @Bean MessageService messageService() {
        return new MessageServiceImpl();
    }
 
}
