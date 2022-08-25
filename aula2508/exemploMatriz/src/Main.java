import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrizA = new int[10][10];
        Random r = new Random();
        //Encher a matriz com dados aleatórios
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizA[i][j] = r.nextInt(9);
            }
        }
        //mostrar a matriz com seus dados
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d] ", matrizA[i][j]);
            }
            System.out.println();
        }

    }
}