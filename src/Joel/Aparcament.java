package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aparcament {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        List<String> resultados = new ArrayList<String>();
        boolean continuar = true;
        do {
            int coche = in.nextInt();
            String resultado = "NO";
            if (coche != 0){
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
                int diferencia = 1000000000;
                for (int i = 0; i < sitios.size(); i++) {
                    if (sitios.get(i) >= coche && sitios.get(i) - coche < diferencia) {
                        resultado = "SI " + (i + 1);
                        diferencia = sitios.get(i) - coche;
                    } 
                }
                resultados.add(resultado);
            } else {
                continuar = false;
            }
        }while (continuar);
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
        }
        in.close();
    }
}
