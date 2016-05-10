package de.swm.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by xie on 2016/5/10.
 */
@Component
public class Consumer {

    @JmsListener(destination = "audio.konserver.topic")
    public void receiveTopic(String text) {
        System.out.println("message: " + text);
    }
}
