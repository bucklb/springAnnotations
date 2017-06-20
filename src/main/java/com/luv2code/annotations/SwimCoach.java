package com.luv2code.annotations;

// illustrate code bean (as opposed to xml based)

public class SwimCoach implements Coach{

    private FortuneService fS;

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    private String eMail;

    public SwimCoach(){
        System.out.println("Swim coach - constructor");
    }

    // Allow injection via setter
    public void setFs(FortuneService fS) {
        System.out.println("Setting SwimCoach fS");
        this.fS = fS;
    }

    public SwimCoach(FortuneService theFortuneService){
        System.out.println("Constructing SnookerCoach");
        fS=theFortuneService;
    }

    public String getDailyWorkout() {
        return "Wetter than an otter's pocket";
    }
    public String getDailyFortune() {
        if (fS != null){
            return fS.getFortune();
        }else{
            return "No fortune Service";
        }
    }

    public void initSnooker(){
        System.out.println("called initSnooker");
    }
    public void destroySnooker(){
        System.out.println("called destroySnooker");
    }


}
