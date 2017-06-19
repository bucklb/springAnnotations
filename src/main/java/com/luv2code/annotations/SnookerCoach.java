package com.luv2code.annotations;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

public class SnookerCoach implements Coach{

    /*
    private FortuneService fS;

    public void setfS(FortuneService fS) {
        System.out.println("Setting SnookerCoach fS");
        this.fS = fS;
    }

    public SnookerCoach(FortuneService theFortuneService){
        System.out.println("Constructing SnookerCoach");
        fS=theFortuneService;
    }

    ////	@Override
    public String getDailyFortune() {
        return fS.getFortune();
    }

*/
    public SnookerCoach(){
    }


    public String getDailyWorkout() {
        return "Pockety pockety";
    }




}
