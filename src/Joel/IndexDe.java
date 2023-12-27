package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexDe {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int total = in.nextInt();
            List<Integer> folis = new ArrayList<>();
            for (int j = 0; j < total; j++) {
                folis.add(in.nextInt());
            }
            int foli = in.nextInt();
            int contador = 0;
            boolean encontrado = false;
            do {
                if (contador == folis.size()) {
                    contador = -1;
                    encontrado = true;
                }
                if (contador >= 0 && folis.get(contador) == foli)
                    encontrado = true;

                if (!encontrado)
                    contador++;
            } while (!encontrado);
            System.out.println(contador);
        }
        in.close();
    }
}