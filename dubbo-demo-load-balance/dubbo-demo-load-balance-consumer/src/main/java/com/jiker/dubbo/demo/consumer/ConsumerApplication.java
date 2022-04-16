package com.jiker.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiker.dubbo.demo.UserService;

public class ConsumerApplication {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        UserService userService = context.getBean("userService", UserService.class);

        for(int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println("result:" + userService.getUserByUserName("*").toString());
        }
    }
}
