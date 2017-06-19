package com.luv2code.annotations;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

public class SnookerCoach implements Coach{

    private FortuneService fS;
    public String getDailyFortune() {
        return fS.getFortune();
    }

    public SnookerCoach(){
        System.out.println("Snooker coach - constructor");
    }

    // Allow injection via setter
    public void setFs(FortuneService fS) {
        System.out.println("Setting SnookerCoach fS");
        this.fS = fS;
    }

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


    public String getDailyWorkout() {
        return "Pockety pockety";
    }




}
