package demo.pattern.singleton;

public class GreetingService {

    // region singleton

    private static GreetingService instance;

    public static GreetingService getInstance() {
        if(instance == null)
            instance = new GreetingService();

        return instance;
    }

    private GreetingService() {
        System.out.println("Instantiation");
    }

    // endregion

    private final String GREETING = "Salut!";


    public void greet(){
        System.out.println( GREETING );
    }
}
