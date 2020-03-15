package com.tej.springdemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on baseball practice" + "- " +fortuneService.generateFortuneForTheDay();
    }
}
