package Joel;

import java.util.Scanner;

public class EscalaReial {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < casos; i++) {
            int[] jugada = new int[7];
            String resultat = "NO";
            for (int j = 0; j < 7; j++) {
                jugada[j] = in.nextInt();
            }
            for (int k = 0; k < 7; k++) {
                int coincide = 1;
                if (jugada[k] < 11 && resultat != "ESCALA REIAL") {

                    for (int l = 1; l < 5; l++) {
                        int carta = jugada[k] + l;
                        for (int m = 0; m < 7; m++) {
                            if (l == 4 && carta == 14 && jugada[m] == 1) {
                                coincide = 10;
                                break;
                            }
                            if (carta == jugada[m]) {
                                coincide++;
                                break;
                            }
                        }
                        if (coincide == 10) {
                            resultat = "ESCALA REIAL";
                        }
                        if (coincide == 5 && resultat != "ESCALA REIAL") {
                            resultat = "ESCALA";
                        }

                    }
                }

            }
            System.out.println(resultat);
        }
        in.close();
    }
}