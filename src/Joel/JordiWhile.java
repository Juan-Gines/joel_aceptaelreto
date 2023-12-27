package Joel;

import java.util.Scanner;

public class JordiWhile {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int strikes = 0;
        int contador = 0;
        do {
            int num = in.nextInt();
            if (num == -1)
                strikes++;
            else
                contador++;
        } while (strikes < 3);
        System.out.println(contador);
        in.close();

    }
}
