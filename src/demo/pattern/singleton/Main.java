package demo.pattern.singleton;

public class Main {

    public static void main(String[] args) {
        GreetingService gs = GreetingService.getInstance();
        gs.greet();
    }

}
