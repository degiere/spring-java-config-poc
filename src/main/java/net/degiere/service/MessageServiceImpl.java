package net.degiere.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
	
    final static Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
    
    @Value("${message}") String message;

    public String getMessage() {
        String msg = message;
        logger.info("message is: {}", msg);
        return msg;
    }

}
