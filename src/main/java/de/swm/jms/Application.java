package de.swm.jms;

import org.apache.activemq.command.ActiveMQTopic;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Topic;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xie on 2016/5/10.
 */

@SpringBootApplication
@EnableJms
public class Application {

    private static final Logger LOG = Logger.getLogger(Application.class);



    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
        jmsTemplate.setPubSubDomain(true);
        jmsTemplate.convertAndSend("audio.konserver.topic", "hello world init");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i=0 ; i<10; i++) {
            int j = i;
            executorService.execute(() ->{
                LOG.info("send message : " + j);
                jmsTemplate.convertAndSend("audio.konserver.topic", "hello world " + j);
            });
        }

    }
}
