package net.degiere.scheduler;

import javax.inject.Inject;

import net.degiere.service.MessageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledMessageProcessor {

    final static Logger logger = LoggerFactory.getLogger(ScheduledMessageProcessor.class);
    
    @Inject MessageService messageService;

    /**
     * Process every 10 seconds
     * 
     * @see org.springframework.scheduling.support.CronSequenceGenerator
     */
    @Scheduled(cron = "*/10 * * * * *")
    public void process() {
        messageService.getMessage();
    }

}
