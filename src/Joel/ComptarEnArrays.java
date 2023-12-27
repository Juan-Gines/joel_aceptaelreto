package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComptarEnArrays {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int total = in.nextInt();
            List<Integer> numero = new ArrayList<>();
            for (int j = 0; j < total; j++) {
                numero.add(in.nextInt());
            }
            int comprova = in.nextInt();
            int contador = 0;
            for (int num : numero) {
                if (num == comprova)
                    contador++;
            }
            System.out.println(contador);
        }
        in.close();
    }
}