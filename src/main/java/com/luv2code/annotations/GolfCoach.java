package com.luv2code.annotations;

        import javax.annotation.PostConstruct;
        import javax.annotation.PreDestroy;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach{

//    @Value("${aa.email}")
//    private String email;

    @PreDestroy
    public void doKill(){
        System.out.println(">> golf KILL");
    }
    @PostConstruct
    public void doInit(){
        System.out.println(">> golf INITed");
    }

    private FortuneService fS;
    public String getDailyFortune() {
        if (fS != null){
            return fS.getFortune();
        }else{
            return "No fortune Service";
        }
    }

    public GolfCoach(){
        System.out.println("Golf coach - constructor");
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
        return "Swing at those balls " ;
    }


    @Autowired
    public void subsequentRndomThing(){
        System.out.println("subsequent RANDOMNESS APLENTY");
    }

    @Autowired
    public void randomThing(){
        System.out.println("RANDOMNESS APLENTY");
    }

    // ?? autowired will fire things in run up to objetc creation ??
    @Autowired
    public void anotherRandomThing(){
        System.out.println("Even More RANDOMNESS APLENTY");
    }

}
