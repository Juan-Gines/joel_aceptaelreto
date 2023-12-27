package Joel;

import java.util.Scanner;

public class ExplosionArcana1 {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int dany = in.nextInt();
        int explosions = in.nextInt();
        int total = 0;
        for (int i = 0; i < explosions; i++) {
            total += dany * (i + 1);
        }
        System.out.println(total);
        in.close();
    }
}
