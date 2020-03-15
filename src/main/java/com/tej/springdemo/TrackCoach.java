package com.tej.springdemo;

import lombok.Data;

@Data
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String emailId;
    static int count=1;

    TrackCoach()
    {
        System.out.println("Constructor Invoked "+ count+ " time");
        count ++;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K" +  "- " +fortuneService.generateFortuneForTheDay() +  "- " + getName()  + "- "+ getEmailId() ;
    }


}
