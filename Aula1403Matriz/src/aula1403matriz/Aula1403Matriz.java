package aula1403matriz;

public class Aula1403Matriz {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
        //Percorrer
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        //Percorrer usando foreach
        for (int[] linha : matriz) {
            for (int n : linha) {
                System.out.printf("%3d ", n);
            }
            System.out.println("");
        }
        
    }
    
}
