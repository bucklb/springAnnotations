package com.luv2code.annotations;

// illustrate injection via setter (XML)

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
    public SnookerCoach(FortuneService theFortuneService){
        System.out.println("Constructing SnookerCoach");
        fS=theFortuneService;
    }
*/

    public String getDailyWorkout() {
        return "Pockety pockety";
    }

    public void initSnooker(){
        System.out.println("called initSnooker");
    }
    public void destroySnooker(){
        System.out.println("called destroySnooker");
    }


}
