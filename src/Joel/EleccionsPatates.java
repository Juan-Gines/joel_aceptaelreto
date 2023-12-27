package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleccionsPatates {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int opcions = in.nextInt();
            List<Integer> vots = new ArrayList<>();
            for (int j = 0; j < opcions; j++) {
                vots.add(in.nextInt());
            }
            int indiceMaximo = 0;
            int maximo = vots.get(0);
            for (int k = 1; k < vots.size(); k++) {
                if (vots.get(k) > maximo) {
                    maximo = vots.get(k);
                    indiceMaximo = k;
                }
            }
            System.out.println(indiceMaximo + 1);
        }
        in.close();
    }
}
