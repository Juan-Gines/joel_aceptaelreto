package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimGrosa {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            List<Integer> importes = new ArrayList<>();
            int total = in.nextInt();
            int numSolicitudes = 0;
            int importe = 0;
            do {
                importe = in.nextInt();
                if (importe != 0)
                    importes.add(importe);
            } while (importe != 0);
            importes.sort(null);
            for (int imp : importes) {
                total -= imp;
                if (total >= 0) {
                    numSolicitudes++;
                }
            }
            System.out.println(numSolicitudes);
        }
        in.close();
    }
}