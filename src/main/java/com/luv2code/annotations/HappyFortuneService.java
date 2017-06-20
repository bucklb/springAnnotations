package com.luv2code.annotations;

/**
 * Created by buckl on 19/06/2017.
 */

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    public HappyFortuneService(){
        System.out.println("Constructing HappyFortuneService");
    }

    public String getFortune() {
        return "Happy, happy. Joy, joy\n";
    };


}
