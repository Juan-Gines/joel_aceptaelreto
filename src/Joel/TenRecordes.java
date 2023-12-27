package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenRecordes {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int total = in.nextInt();
            List<Integer> numero = new ArrayList<>();
            for (int j = 0; j < total; j++) {
                numero.add(in.nextInt());
            }
            int indice = in.nextInt();
            System.out.println(numero.get(indice));
        }
        in.close();
    }
}
