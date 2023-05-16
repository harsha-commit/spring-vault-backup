package com.spring.vault.notificationservice.controller;

import com.spring.vault.notificationservice.model.EmailRequest;
import com.spring.vault.notificationservice.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/notification")
public class EmailController {
    @Autowired
    private EmailSenderService emailSenderService;

    @GetMapping("/sendEmail")
    public Void sendEmail(@RequestBody EmailRequest emailRequest) {
        try {
            emailSenderService.sendSimpleEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
        } catch (MailException e) {

        }
        return null;
    }
}
