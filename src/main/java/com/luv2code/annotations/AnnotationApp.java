package com.luv2code.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// -- Created project using : --
// mvn archetype:generate -DgroupId=com.luv2code.annotations -DartifactId=springAnnotations -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
// -- Created project using : --


public class AnnotationApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 18/6/17 - assume this is where I was looking at mixing XML and AutoWire beans ??

//		Coach theCoach = context.getBean("tennisCoach",Coach.class);


        // Demonstrate getting stuff using the Autowire approach
//        Coach theCoach = context.getBean("golfCoach",Coach.class);
//        System.out.println(theCoach.getDailyWorkout());

//        Coach combiCoach= context.getBean("poloCoach",Coach.class);
//        System.out.println(combiCoach.getDailyWorkout());


        String coachType = "snookerCoach";

        // Demonstrate getting stuff via the XML file (rather than autowire)
//        Coach xmlCoach = context.getBean("tennisCoach",Coach.class);
        Coach xmlCoach = context.getBean(coachType,Coach.class);
        System.out.println(xmlCoach.getDailyWorkout());


        //        System.out.println(theCoach.getDailyFortune());


        context.close();

    }

}
