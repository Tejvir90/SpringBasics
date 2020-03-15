package com.tej.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


    public static void main(String Args[]) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Create Object
        Coach baseBallCoach = classPathXmlApplicationContext.getBean("baseBallCoach", Coach.class);
        Coach trackCoach = classPathXmlApplicationContext.getBean("trackCoach", Coach.class);
        Coach trackCoachSecond = classPathXmlApplicationContext.getBean("trackCoach", Coach.class);
        Coach cricketCoach = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class);
        Coach cricketCoachSecond = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class);
        //Use Object
        System.out.println(baseBallCoach + "-" + baseBallCoach.getDailyWorkout());
        System.out.println(trackCoach + "-" + trackCoach.getDailyWorkout());
        System.out.println(trackCoachSecond + "-" + trackCoachSecond.getDailyWorkout());
        System.out.println(cricketCoach + "-" + cricketCoach.getDailyWorkout());
        System.out.println(cricketCoachSecond + "-" + cricketCoachSecond.getDailyWorkout());
        Coach volleyBallCoach= classPathXmlApplicationContext.getBean("volleyBallCoach", Coach.class);
        System.out.println(volleyBallCoach.getDailyWorkout());
        classPathXmlApplicationContext.close();
    }

}
