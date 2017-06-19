package com.luv2code.annotations;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
*/

//@Component()
public class TennisCoach implements Coach{

/*
    private FortuneService fS;

    //	@Autowired
//	@Qualifier("sadForuneService")
    public TennisCoach(){
        fS=new SadFortuneService();
    }

    public TennisCoach(FortuneService theFortuneService){
        fS=theFortuneService;
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
