package Joel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CampioProgramame2 {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, Integer> guanyadors = new HashMap<>();
      for (int j = 0; j < lineas; j++) {
        String[] linea = in.nextLine().split("-");
        if (guanyadors.containsKey(linea[1])) {
          guanyadors.put(linea[1], guanyadors.get(linea[1]) + 1);
        } else {
          guanyadors.put(linea[1], 1);
        }
      }
      List<Map.Entry<String, Integer>> list = new ArrayList<>(guanyadors.entrySet());
      list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

      for (Map.Entry<String, Integer> entry : list) {
        System.out.println(entry.getKey() + "-" + entry.getValue());
      }
    }
    in.close();
  }
}
