package com.smartprocess.integrations.services;

import com.smartprocess.integrations.dto.EmailDTO;

public interface EmailService {

	 void sendEmail(EmailDTO dto);
}
