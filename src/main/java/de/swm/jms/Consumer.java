package de.swm.jms;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Created by xie on 2016/5/10.
 */
@Component
public class Consumer {

    private static final Logger LOG = Logger.getLogger(Consumer.class);

    @JmsListener(destination = "audio.konserver.topic")
    public void receiveTopic(TextMessage text) throws InterruptedException, JMSException {
        //Thread.sleep(1000);
        LOG.info("receive message: " + text.getText());
    }
}
