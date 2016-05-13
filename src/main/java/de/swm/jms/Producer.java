package de.swm.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * Created by xie on 2016/5/10.
 */

public class Producer implements CommandLineRunner{

   // @Autowired
    //private JmsMessagingTemplate jmsMessagingTemplate;


    @Autowired
    private Topic topic;

    @Override
    public void run(String... strings) throws Exception {
        send("sample message");
        System.out.println("message was sent to the topic");
    }

    public void send(String msg) {
      //  this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }
}
