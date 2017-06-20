package com.luv2code.annotations;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// -- Created project using : --
// mvn archetype:generate -DgroupId=com.luv2code.annotations -DartifactId=springAnnotations -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
// -- Created project using : --


public class AnnotationApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext autoctx = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach=autoctx.getBean("swimCoach",Coach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println("swimail = " +((SwimCoach)swimCoach).geteMail());

/*
        Coach theCoach = autoctx.getBean("poloCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
*/
        // via Autowire type stuff
		Coach theCoach = context.getBean("poloCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Demonstrate getting stuff using the Autowire approach
        System.out.println("-------------- Prototype via annotation ------------------------");
        GolfCoach caddyCoach = context.getBean("golfCoach",GolfCoach.class);
        System.out.println(caddyCoach.getDailyWorkout());
        System.out.println(caddyCoach.getDailyFortune());

        caddyCoach.setfS(new SadFortuneService());

        Coach golfCoach = context.getBean("golfCoach",Coach.class);

        System.out.println(golfCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyFortune());

        System.out.println(caddyCoach.getDailyWorkout());
        System.out.println(caddyCoach.getDailyFortune());



        Coach passatCoach= context.getBean("passatCoach",Coach.class);
        System.out.println(passatCoach.getDailyWorkout());
        System.out.println(passatCoach.getDailyFortune());


        // Demonstrate getting stuff via the XML file (rather than autowire)
        Coach xmlCoach;

        Coach dupCoach = context.getBean("tennisCoach",Coach.class);
        ((TennisCoach)dupCoach).setTeam("tennis coach other team");
        System.out.println(((TennisCoach)dupCoach).getTeam());
//        System.out.println(xmlCoach.getDailyWorkout());
//        System.out.println(xmlCoach.getDailyFortune());

//        Coach xmlCoach = context.getBean("tennisCoach",Coach.class);
        String coachType = "snookerCoach";
        xmlCoach = context.getBean(coachType,Coach.class);
        System.out.println(xmlCoach.getDailyWorkout());
        System.out.println(xmlCoach.getDailyFortune());

        xmlCoach = context.getBean("tennisCoach",Coach.class);
        System.out.println(((TennisCoach)dupCoach).getTeam()); // should retain the team we gave it
        System.out.println(((TennisCoach)xmlCoach).getTeam());
        System.out.println(xmlCoach.getDailyWorkout());
        System.out.println(xmlCoach.getDailyFortune());

        //        System.out.println(theCoach.getDailyFortune());


        context.close();

    }

}
