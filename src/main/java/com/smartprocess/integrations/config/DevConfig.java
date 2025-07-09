package com.smartprocess.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.smartprocess.integrations.services.EmailService;
import com.smartprocess.integrations.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    EmailService emailService() {
		return new SendGridEmailService();
	}
}
