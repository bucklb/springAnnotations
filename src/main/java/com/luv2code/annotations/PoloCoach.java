package com.luv2code.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PoloCoach implements Coach{

//    @Value("${aa.email}")
//    private String email;

    @PreDestroy
    public void doKill(){
        System.out.println(">> polo KILL");
    }
    @PostConstruct
    public void doInit(){
        System.out.println(">> polo INITed");
    }

    private FortuneService fS;
    public String getDailyFortune() {
        return fS.getFortune();
    }

    public PoloCoach(){
        System.out.println("Polo coach - constructor");
    }


/*
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fS;

//	@Autowired
//	private String s;

    //	@Autowired
    public void setfS(FortuneService fS) {
        System.out.println("Setting GolfCoach fS");
        this.fS = fS;
    }

    ////	@Override
    public String getDailyFortune() {
        return fS.getFortune();
    }
*/

/*
	@Autowired
	public GolfCoach(FortuneService theFortuneService){
		System.out.println("Constructing GolfCoach");
		fS=theFortuneService;
	}
*/

    @Autowired
    public String getDailyWorkout() {
//		System.out.println("getting Daily workout");
//        return "All in wrist " + email;
        return "Horse balls" ;
    }


    @Autowired
    public void subsequentRndomThing(){
        System.out.println("subsequent RANDOMNESS APLENTY - polo");
    }

    @Autowired
    public void randomThing(){
        System.out.println("RANDOMNESS APLENTY - polo");
    }

    // ?? autowired will fire things in run up to objetc creation ??
    @Autowired
    public void anotherRandomThing(){
        System.out.println("Even More RANDOMNESS APLENTY - polo");
    }

}
