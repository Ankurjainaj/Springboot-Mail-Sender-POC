package com.MailPOC.mail.service;

import com.MailPOC.mail.entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);
}
