package Joel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NowSalman2 {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, String> amics = new LinkedHashMap<>();
      for (int j = 0; j < lineas - 1; j++) {
        String[] linea = in.nextLine().split(" ");
        if (amics.containsKey(linea[0])) {
          amics.remove(linea[0]);
          amics.put(linea[0], linea[1]);
        } else {
          amics.put(linea[0], linea[1]);
        }
      }
      String amic = in.nextLine();
      String mejorAmigo = "";
      for (Map.Entry<String, String> entry : amics.entrySet()) {
        if (entry.getValue().equals(amic)) {
          mejorAmigo = entry.getKey();
        }
        if (entry.getKey().equals(amic)) {
          mejorAmigo = entry.getValue();
        }
      }
      System.out.println(mejorAmigo);
    }
    in.close();
  }
}
