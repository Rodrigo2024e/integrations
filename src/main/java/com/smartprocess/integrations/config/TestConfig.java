package com.smartprocess.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.smartprocess.integrations.services.EmailService;
import com.smartprocess.integrations.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    EmailService emailService() {
		return new MockEmailService();
	}
}
