package com.luv2code.annotations;

// Illustrate setting dependency directly (not via constructor nor setter

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PassatCoach implements Coach{

//    @Value("${aa.email}")
//    private String email;

    @PreDestroy
    public void doKill(){
        System.out.println(">> passat KILL");
    }
    @PostConstruct
    public void doInit(){
        System.out.println(">> passat INITed");
    }

    // Specify that it's to use a dependency that it can locate via bean "aHappySevice"
    // @Qualifier is needed as there are multiple options for a fortuneService -
    //   2 beans from XML (aHappy .. and aSad ...)
    //   1 raw classes that has the @Component annotation (Happy ...)
    // - looks like @Qualifier MUST LIVE IN the parameter list for constructor
    @Autowired
    @Qualifier("aHappyFortuneService")
    private FortuneService fS;

    public String getDailyFortune() {
        if (fS != null){
            return fS.getFortune();
        }else{
            return "No fortune Service";
        }
    }

    public PassatCoach(){
        System.out.println("Passat coach - constructor");
    }


//	@Autowired
//	private String s;




    public String getDailyWorkout() {
        return "Dropped the ball with emmission test cheats" ;
    }

}
