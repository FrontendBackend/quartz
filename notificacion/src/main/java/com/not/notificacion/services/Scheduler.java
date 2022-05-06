package com.not.notificacion.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Scheduled(cron = "${cron.exp}", zone = "America/Lima")
    public void scheduleTaskUsingCronExpresion() {

        long now = System.currentTimeMillis() / 1000;

        System.out.println("schedule task using cron jobs - " + now);
    }
}
