package com.hlr.mail_sendler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MailSendlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailSendlerApplication.class, args);

	}
}

