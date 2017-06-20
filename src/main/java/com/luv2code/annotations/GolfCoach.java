package com.luv2code.annotations;

// illustrate injecting via setter

        import javax.annotation.PostConstruct;
        import javax.annotation.PreDestroy;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Qualifier;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Scope;
        import org.springframework.stereotype.Component;

// @Component specifies that we want to use this as a bean.
// If we don't specify the bean/component name then it uses the lower case version of the class (MyClass->myClass)
@Component
@Scope("prototype")
public class GolfCoach implements Coach{

    @Value("${aa.email}")
    private String email;

    @PreDestroy
    public void doKill(){
        System.out.println(">> golf KILL");
    }
    @PostConstruct
    public void doInit(){
        System.out.println(">> golf INITed");
    }


    private FortuneService fS;

    public GolfCoach(FortuneService theFortuneService){
        System.out.println("Constructing GolfCoach");
        fS=theFortuneService;
    }

    // Specify that it's to grab a dependency that it can locate via bean "aHappySevice"
    // @Qualifier is needed as there are multiple options for a fortuneService -
    //   2 beans from XML (aHappy .. and aSad ...)
    //   1 raw classes that has the @Component annotation (Happy ...)
    // - looks like @Qualifier can live outside the parametr list for setter
    @Autowired
    public void setfS(@Qualifier("happyFortuneService") FortuneService fS) {
        System.out.println("Setting GolfCoach fS");
        this.fS = fS;
    }


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
//	@Autowired
//	private String s;

    //	@Autowired
    public void setfS(FortuneService fS) {
        System.out.println("Setting GolfCoach fS");
        this.fS = fS;
    }

*/



    public String getDailyWorkout() {
        return "Swing at those balls " ;
    }

    @Autowired
    public void randomThing(){
        System.out.println("RANDOMNESS APLENTY");
    }

}
