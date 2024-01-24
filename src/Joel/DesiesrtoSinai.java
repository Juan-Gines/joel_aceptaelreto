package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesiesrtoSinai {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, Integer> mapas = new HashMap<>();
      for (int j = 0; j < lineas; j++) {
        String linea = in.nextLine();
        if (mapas.containsKey(linea)) {
          mapas.put(linea, mapas.get(linea) + 1);
        } else {
          mapas.put(linea, 1);
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
