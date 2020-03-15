package com.tej.springdemo;

import lombok.Data;

@Data

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    BaseBallCoach() {
        System.out.println("In Baseball constructor");
    }

    BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("In Baseball constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on baseball practice" + "- " + fortuneService.generateFortuneForTheDay();
    }

    private void startUpStuff() {
        System.out.println("Do my start up stuff");
    }

    private void cleanUpStuff() {
        System.out.println("Do destroy stuff");
    }


}
