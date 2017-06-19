package com.luv2code.annotations;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
*/

//@Component()
public class TennisCoach implements Coach{

    private FortuneService fS;

    // FortuneService via constructor
    public TennisCoach(FortuneService theFortuneService){
        System.out.println("Tennis coach - constructor");
        fS=theFortuneService;
    }
    public String getDailyFortune() {
        return fS.getFortune();
    }

/*
    private FortuneService fS;

    //	@Autowired
//	@Qualifier("sadForuneService")
    public TennisCoach(){
        fS=new SadFortuneService();
    }


    ////@Override
    public String getDailyFortune() {
        return fS.getFortune();
    }
*/

    public TennisCoach(){
    }

    public TennisCoach(String s){
    }

    public String getDailyWorkout() {
        return "Anyone for balls";
    }


}
