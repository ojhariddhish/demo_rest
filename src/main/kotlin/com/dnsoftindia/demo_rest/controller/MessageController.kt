package com.dnsoftindia.demo_rest.controller

import com.dnsoftindia.demo_rest.model.Message
import org.springframework.web.bind.annotation.*

@RestController
class MessageController {

    @GetMapping("/message")
    fun send(): Message {
        return Message("First web service")
    }

    @PostMapping("/message")
    fun echo(@RequestBody message: Message): Message {
        return message
    }

}