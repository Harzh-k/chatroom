package com.chat.app.controller;


import com.chat.app.models.Meesage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to") // send message to subscribed user
    public Meesage getContent(@RequestBody Meesage message){
        return message; // returnig user message
    }
}
