package Joel;

import java.util.Scanner;

public class Bloodborne {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        int total;

        for (int i = 0; i < casos; i++) {
            total = in.nextInt();
            int[] numeros = new int[total];
            for (int j = 0; j < total; j++) {
                numeros[j] = in.nextInt();
            }
            String resultat = "NO";
            for (int j = 0; j < total - 1; j++) {
                if (numeros[j] == numeros[j + 1])
                    resultat = "SI";
            }
            System.out.println(resultat);
        }
        in.close();
    }
}