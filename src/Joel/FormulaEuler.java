package Joel;

import java.util.Arrays;
import java.util.Scanner;

public class FormulaEuler {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < casos; i++) {
            int totalNumeros = in.nextInt();
            int[] numeros = new int[totalNumeros];
            for (int j = 0; j < totalNumeros; j++) {
                numeros[j] = in.nextInt();
            }
            Arrays.sort(numeros);
            for (int k = 0; k < totalNumeros / 2; k++) {
                System.out.print(numeros[k] + numeros[totalNumeros - 1 - k] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}