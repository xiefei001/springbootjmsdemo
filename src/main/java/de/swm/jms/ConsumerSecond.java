package de.swm.jms;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.util.concurrent.TimeUnit;

/**
 * Created by xie on 2016/5/13.
 */
@Component
public class ConsumerSecond {

    private static final Logger LOG = Logger.getLogger(ConsumerSecond.class);

    @JmsListener(destination = "audio.konserver.topic_1")
    public void receiveTopic(TextMessage text) throws InterruptedException, JMSException {
        //Thread.sleep(500);
        LOG.info("receive message: " + text.getText());
        TimeUnit.SECONDS.sleep(2);
        LOG.info("finisch receive message: " + text.getText());
    }
}
