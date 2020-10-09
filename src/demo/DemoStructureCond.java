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



        // La structure switch

        if( age == 12 ){
            System.out.println("Bienvenu dans l'adolescence");
        }
        else if( age == 18 ){
            System.out.println("Bienvenu dans la vie d'adulte");
        }
        else if( age == 40 ){
            System.out.println("Bienvenu dans la crise de la quarantaire");
        }
        else {
            System.out.println("Vous n'êtes pas à un age charnière");
        }

        System.out.println("\n---structure switch---\n");

        age = 11;

        switch ( age ){
            case 11:
            case 12:
            case 13:
                System.out.println("Bienvenu dans l'adolescence");
                break;

            case 18:
                System.out.println("Bienvenu dans la vie d'adulte");
                break;

            case 40:
                System.out.println("Bienvenu dans la crise de la quarantaire");
                break;

            default:
                System.out.println("Vous n'êtes pas à un age charnière");
        }

        // opérateur ternaire

        String adulte;
        if(age >= 18){
            adulte = "adulte";
        }
        else{
            adulte = "enfant";
        }
        System.out.println( "L'utilisateur est un " + adulte );


        adulte = (age >= 18 ? "adulte" : "enfant");
        System.out.println("L'utilisateur est un " + adulte );

    }
}
