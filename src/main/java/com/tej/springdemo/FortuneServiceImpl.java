package com.tej.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {

    @Override
    public String generateFortuneForTheDay() {
        return "You make your own destiny";
    }

}
