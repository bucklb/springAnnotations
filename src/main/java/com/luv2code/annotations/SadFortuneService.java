package com.luv2code.annotations;

/**
 * Created by buckl on 19/06/2017.
 */

import org.springframework.stereotype.Component;


public class SadFortuneService implements FortuneService {

    public SadFortuneService(){
        System.out.println("Constructing SadFortuneService");
    }

    public String getFortune() {
        return "Woe, Woe & Thrice Woe\n";
    }

}
