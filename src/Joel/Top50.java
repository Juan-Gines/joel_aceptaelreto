package Joel;

import java.util.Scanner;

public class Top50 {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int ranq = in.nextInt();
        int torneos = in.nextInt();
        for (int i = 0; i < torneos; i++) {
            ranq /= 2;
        }
        System.out.println(ranq);
        in.close();
    }
}
