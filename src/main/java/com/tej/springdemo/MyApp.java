package com.tej.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


    public static void main(String Args[]) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Create Object
        Coach baseBallCoach = classPathXmlApplicationContext.getBean("baseBallCoach", Coach.class);
        Coach trackCoach = classPathXmlApplicationContext.getBean("trackCoach", Coach.class);
        //Use Object
        System.out.println(baseBallCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
        classPathXmlApplicationContext.close();
    }

}
