package Joel;

import java.util.Scanner;

public class CagaTio {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int generacio = in.nextInt();
            if (generacio < 3) {
                System.out.println("Caga tio!");
            } else {
                String frase = "Caga ";
                int tios = generacio % 2 == 0 ? generacio / 2 - 1 : generacio / 2;
                for (int j = 0; j < tios; j++) {
                    frase += "caga";
                }
                frase += "tio!";
                System.out.println(frase);
            }
        }
        in.close();
    }
}
