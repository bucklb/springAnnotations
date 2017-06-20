package com.luv2code.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by buckl on 20/06/2017.
 */
@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.luv2code.annotations")
public class SportConfig {

    @Bean
    public FortuneService happyBeanService(){
        return new HappyFortuneService();
    }

    @Value("${aa.email}")
    private String email;

    @Bean
    public Coach swimCoach(){
        // Makes little odds if use in constructor or setter as far as i can see)
//        SwimCoach mySwimCoach = new SwimCoach(happyBeanService());
        SwimCoach mySwimCoach = new SwimCoach();
        mySwimCoach.setFs(happyBeanService());
        mySwimCoach.seteMail(email );


        return mySwimCoach;
    }

}
