package Joel;

import java.util.Scanner;

public class JordiWhile2 {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int strikes = 0;
        int viewers = 0;
        do {
            int num = in.nextInt();
            if (num == -1)
                strikes++;
            else
                viewers += num;
        } while (strikes < 3);
        System.out.println(viewers);
    }
}
