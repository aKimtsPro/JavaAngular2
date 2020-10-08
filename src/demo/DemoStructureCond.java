package demo;

public class DemoStructureCond {

    public static void main(String[] args) {

        // structure if

        int age = 10;

        if( age >= 17 ){
            System.out.println("il peut conduire");
        }

        System.out.println("fin de la structure if\n\n");

        // structure if ... else

        if( age >= 17 ){
            System.out.println("il peut conduire");
        }
        else{
            System.out.println("il prendra le bus");
        }

        System.out.println("fin de la structure if ... else\n\n");


        // structure if ... else if ... else

        if( age >= 17 ){ // 17 <= age
            System.out.println("il peut conduire une voiture");
        }
        else if( age >= 15 ){ // 15 <= age < 17
            System.out.println("il peut conduire une moto");
        }
        else if( age >= 12 ){ // 12 <= age < 15
            System.out.println("il peut conduire un velo");
        }
        else { // age < 12
            System.out.println("Il prend le bus");
        }
    }
}
