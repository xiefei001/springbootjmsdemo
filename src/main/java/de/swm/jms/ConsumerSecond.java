package de.swm.jms;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Created by xie on 2016/5/13.
 */
@Component
public class ConsumerSecond {

    private static final Logger LOG = Logger.getLogger(ConsumerSecond.class);

    @JmsListener(destination = "audio.konserver.topic")
    public void receiveTopic(TextMessage text) throws InterruptedException, JMSException {
        //Thread.sleep(500);
        LOG.info("receive message: " + text.getText());
    }
}
