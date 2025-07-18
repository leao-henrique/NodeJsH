package com.hlr.mail_sendler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Scheduler {

    @Scheduled(fixedRate = 60000)
    public void executarTarefaAgendada() {

        System.out.println("Rodando tarefa às: " + LocalDateTime.now());
    }
}
