package com.tej.springdemo;

public class CricketCoach implements Coach{

    static int count=1;
    CricketCoach()
    {
        System.out.println("You are invoking baseball Coach");
        System.out.println("Constructor Invoked "+ count+ " time");
        count++;
    }

    @Override
    public String getDailyWorkout()
    {
        return "I am a cricket Coach";
    }

}
