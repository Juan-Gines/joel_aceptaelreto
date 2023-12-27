package Joel;

import java.util.Scanner;

public class Paraules {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < casos; i++) {
            String frase = in.nextLine();
            frase = frase.trim();
            String[] palabrasFrase = frase.split("\\s+");
            System.out.println(palabrasFrase.length);
        }
        in.close();
    }
}
