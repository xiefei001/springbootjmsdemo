package de.swm.jms;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Topic;

/**
 * Created by xie on 2016/5/10.
 */

@SpringBootApplication
@EnableJms
public class Application {

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("audio.konserver.topic");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
