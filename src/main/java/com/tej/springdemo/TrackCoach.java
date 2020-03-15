package com.tej.springdemo;

import lombok.Data;

@Data
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String emailId;

    TrackCoach()
    {
        System.out.println("Hello World");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K" +  "- " +fortuneService.generateFortuneForTheDay() +  "- " + getName()  + "- "+ getEmailId() ;
    }


}
