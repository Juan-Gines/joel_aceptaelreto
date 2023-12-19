package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aparcament {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        List<String> resultados = new ArrayList<String>();
        int coche=1;
        while (coche != 0) {
            coche = in.nextInt();
            if (coche == 0)
                break;
            coche = coche + coche / 2;
            List<Integer> sitios = new ArrayList<Integer>();               
            int a, b = 0;
            do {
                a = in.nextInt();
                if (a != 0) {
                    b = in.nextInt();
                    sitios.add(b - a);
                }

            } while (a != 0);
            String resultado = null;
            for (int i = 0; i < sitios.size(); i++) {
                if (sitios.get(i) >= coche) {
                    resultado = "SI " + (i + 1);
                    break;
                } else {
                    resultado = "NO";
                }
            }
            resultados.add(resultado);
        }
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
        }
    }

}
