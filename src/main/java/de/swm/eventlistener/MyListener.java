package de.swm.eventlistener;

import org.apache.log4j.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by xie on 2016/5/31.
 */


@Component
public class MyListener {

    Logger LOG = Logger.getLogger(MyListener.class);

    /**
     * Der Listener ist single thread, das heisst, die Events senden und bearbeiten werden in einem Thread bearbeitet.
     * @param event
     * @throws InterruptedException
     */
    @EventListener
    public void handleApplicationEvent(MyEvent event) throws InterruptedException {
        LOG.info("start handling event: " + event.getSource());

        TimeUnit.SECONDS.sleep(5);
        LOG.info("End handling Event: " + event.getSource());
    }

}
