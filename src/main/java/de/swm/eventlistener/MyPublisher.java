package de.swm.eventlistener;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by xie on 2016/5/31.
 */
@Component
public class MyPublisher {

    private static final Logger LOG = Logger.getLogger(MyPublisher.class);
    @Autowired
    private ApplicationEventPublisher publisher;


    public void sendEvents(){
        LOG.info("publisch event 3");
        publisher.publishEvent(new MyEvent(new Integer(3)));
        LOG.info("publisch event 4");
        publisher.publishEvent(new MyEvent(new Integer(4)));
        LOG.info("publisch event 5");
        publisher.publishEvent(new MyEvent(new Integer(5)));
    }
}
