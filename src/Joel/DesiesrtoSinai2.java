package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesiesrtoSinai2 {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, Integer> mapas = new HashMap<>();
      for (int j = 0; j < lineas; j++) {
        String[] linea = in.nextLine().split(" ");
        String mapa = "";
        int votos = 0;
        for (int k = 0; k < linea.length; k++) {
          if (k == linea.length - 1)
            votos = Integer.parseInt(linea[k]);
          else if (k == linea.length - 2)
            mapa += linea[k];
          else
            mapa += linea[k] + " ";
        }
        if (mapas.containsKey(mapa)) {
          mapas.put(mapa, mapas.get(mapa) + votos);
        } else {
          mapas.put(mapa, votos);
        }
      }
      int max = 0;
      String mapa = "";
      for (Map.Entry<String, Integer> entry : mapas.entrySet()) {
        if (entry.getValue() > max) {
          max = entry.getValue();
          mapa = entry.getKey();
        }
      }
      System.out.println(mapa);
    }
    in.close();
  }
}
