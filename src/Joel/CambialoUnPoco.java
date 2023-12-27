package Joel;

import java.util.Scanner;

public class CambialoUnPoco {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int total = in.nextInt();
            int[] numeros = new int[total];
            for (int j = 0; j < total; j++) {
                numeros[j] = in.nextInt();
            }
            int vell = in.nextInt();
            int nou = in.nextInt();
            for (int n : numeros) {
                if (n == vell)
                    System.out.print(nou + " ");
                else
                    System.out.print(n + " ");
            }
            System.out.println();
        }
        in.close();
    }
}