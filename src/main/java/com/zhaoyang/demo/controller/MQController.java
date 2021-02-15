package com.zhaoyang.demo.controller;

import com.zhaoyang.demo.kafka.Consumer;
import com.zhaoyang.demo.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曾昭阳
 * @date 2021/2/15 21:04
 * @email 473811301@qq.com
 */
@RestController("/MQ")
public class MQController {

    private final Producer producer;
    private final Consumer consumer;

    @Autowired
    public MQController(Producer producer, Consumer consumer) {
        this.producer = producer;
        this.consumer = consumer;
    }

    @RequestMapping("/send")
    public void send(String msg) {
        producer.send(msg);
    }
}
