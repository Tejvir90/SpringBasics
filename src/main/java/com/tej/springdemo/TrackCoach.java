package com.tej.springdemo;

import lombok.Data;

@Data
public class TrackCoach implements Coach {

    static int count = 1;
    private FortuneService fortuneService;
    private String name;
    private String emailId;

    TrackCoach() {
        System.out.println("Track Coach Constructor Invoked " + count + " time");
        count++;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K" + "- " + fortuneService.generateFortuneForTheDay() + "- " + getName() + "- " + getEmailId();
    }


}
