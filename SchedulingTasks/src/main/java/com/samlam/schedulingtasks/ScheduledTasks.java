package com.samlam.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.SocketImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:SS");

    /**
     * Scheduled annotation defines when a particular method runs
     * e.g. fixedRate: time interval between methods
     */

    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime() {
        log.info("The time is now {} ", dateFormat.format(new Date()));
        log.info("Fixed time delay {} ", System.currentTimeMillis() / 10000);
    }
}
