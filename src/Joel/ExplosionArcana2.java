package Joel;

import java.util.Scanner;

public class ExplosionArcana2 {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int dany = in.nextInt();
        int hp = in.nextInt();
        int contador = 0;
        do {
            contador++;
            hp -= dany * contador;
        } while (hp > 0);

        System.out.println(contador);
        in.close();
    }
}
