package Joel;

import java.util.Scanner;

public class ParchisParchis {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            int inicial = in.nextInt();
            int[] tiradas = new int[3];
            for (int j = 0; j < 3; j++) {
                tiradas[j] = in.nextInt();
            }
            for (int j = 0; j < 3; j++) {
                if (inicial != 8) {
                    inicial = inicial + tiradas[j] - 8;
                    if (inicial != 0) {
                        inicial = 8 - Math.abs(inicial);
                    } else {
                        inicial = 8;
                    }
                }
            }
            System.out.println(inicial);
        }
        in.close();
    }
}