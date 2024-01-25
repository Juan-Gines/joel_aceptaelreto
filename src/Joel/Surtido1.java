package Joel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Surtido1 {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int galetes = in.nextInt();
      in.nextLine();
      Map<String, Integer> capsa = new LinkedHashMap<>();
      for (int j = 0; j < galetes; j++) {
        String galeta = in.nextLine();
        if (capsa.containsKey(galeta)) {
          capsa.put(galeta, capsa.get(galeta) + 1);
        } else {
          capsa.put(galeta, 1);
        }
      }
      int minGaletes = 2147483647;
      for (Map.Entry<String, Integer> g : capsa.entrySet()) {
        if (g.getValue() < minGaletes) {
          minGaletes = g.getValue();
        }
      }
      System.out.println(minGaletes);
    }
    in.close();
  }
}
