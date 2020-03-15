package com.tej.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class MyAnnotationApp {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

        Coach volleyBallCoach= classPathXmlApplicationContext.getBean("volleyBallCoach", Coach.class);
        System.out.println(volleyBallCoach.getDailyWorkout());
    }
}
