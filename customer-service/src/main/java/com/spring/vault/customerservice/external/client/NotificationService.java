package com.spring.vault.customerservice.external.client;

import com.spring.vault.customerservice.model.EmailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "NOTIFICATION-SERVICE/notification")
public interface NotificationService {
    @GetMapping("/sendEmail")
    Void sendEmail(@RequestBody EmailRequest emailRequest);
}
