package demo.collectionTableau;

public class DemoForeach {

    public static void main(String[] args) {
        
        int[][] tab = {{1},{2},{3}};

        for (int[] element : tab) {
            element[0] += 2;
        }

        for (int[] element : tab) {
            System.out.println( element[0] );
        }

        
    }
}
