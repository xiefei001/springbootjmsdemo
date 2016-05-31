package de.swm.eventlistener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by xie on 2016/5/31.
 */
public class MyEvent extends ApplicationEvent{
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
