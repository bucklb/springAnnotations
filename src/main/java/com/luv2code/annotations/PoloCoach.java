package com.luv2code.annotations;

// illustrate injection via constructor

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
        if (fS != null){
            return fS.getFortune();
        }else{
            return "No fortune Service";
        }
    }

    public PoloCoach(){
        System.out.println("Polo coach - constructor");
    }

    // Specify that it's to grab a dependency that it can locate via bean "aHappySevice"
    // @Qualifier is needed as there are multiple options for a fortuneService -
    //   2 beans from XML (aHappy .. and aSad ...)
    //   1 raw classes that has the @Component annotation (Happy ...)
    // - looks like @Qualifier MUST LIVE IN the parameter list for constructor
	@Autowired
	public PoloCoach(@Qualifier("aSadFortuneService") FortuneService theFortuneService){
		System.out.println("Constructing PoloCoach");
		fS=theFortuneService;
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


    public String getDailyWorkout() {
        return "Horse balls" ;
    }

    // ?? autowired will fire things in run up to objetc creation ??
    @Autowired
    public void anotherRandomThing(){
        System.out.println("Even More RANDOMNESS APLENTY - polo");
    }

}
