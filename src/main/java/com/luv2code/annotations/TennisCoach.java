package com.luv2code.annotations;

// illustrate injection by constructor (XML)

public class TennisCoach implements Coach{

    private FortuneService fS;

    private String team;
    public void setTeam(String theTeam){
        this.team=theTeam;
    }
    public String getTeam(){
        return "Team : " + this.team;
    }

    // Allow injection via constructor
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
