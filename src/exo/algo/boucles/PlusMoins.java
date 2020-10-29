package exo.algo.boucles;

import java.util.Scanner;

public class PlusMoins {

    public static void main(String[] args) {


        int lowerBound, upperBound, range;
        Scanner scanner = new Scanner(System.in);

        do{

            int  randomNb, userNb, essaiDispo = 10;

            lowerBound = 1;
            upperBound = 100;
            range = (upperBound - lowerBound) + 1;

            randomNb = (int)(Math.random() * range) + lowerBound;


            do {

                System.out.println("Entrer un nombre entier entre 1 et 100 (encore "+essaiDispo+ " essais):");
                userNb = scanner.nextInt();

                if( userNb <= 100 && userNb >= 1 ){
                    if( userNb < randomNb ) {
                        System.out.println("Trop petit");
                    }
                    else if (userNb > randomNb) {
                        System.out.println("Trop grand");
                    }
                    essaiDispo--;
                }
                else{
                    System.out.println("proposition invalide");
                }

            } while (userNb != randomNb && essaiDispo > 0);


            if(userNb == randomNb){
                System.out.println("Trouvé, c'est bien " + randomNb);
            }
            else{
                System.out.println("Quel echec");
            }

            System.out.println("Voulez-vous continuer(true / false)?");

        }while( scanner.nextBoolean() );



    }
}
