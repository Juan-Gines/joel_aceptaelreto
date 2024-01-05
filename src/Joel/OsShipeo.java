package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OsShipeo {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            List<Integer> importes = new ArrayList<>();
            int alumnes = in.nextInt();
            for (int j = 0; j < alumnes; j++) {
                importes.add(in.nextInt());
            }
            importes.sort(null);
            System.out.println(importes.get(importes.size() - 1) - importes.get(0));
        }
        in.close();
    }
}