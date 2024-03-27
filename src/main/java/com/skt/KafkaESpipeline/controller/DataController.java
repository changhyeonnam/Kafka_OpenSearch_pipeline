package com.skt.KafkaESpipeline.controller;

import com.skt.KafkaESpipeline.service.ConsumerPollService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private ConsumerPollService consumerPollService;

    @GetMapping("/consumer")
    public String consumer(){
        return consumerPollService.consumepoll();
    }

}