package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NowSalman {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, String> amics = new HashMap<>();
      for (int j = 0; j < lineas - 1; j++) {
        String[] linea = in.nextLine().split(" ");
        amics.put(linea[0], linea[1]);
      }
      String amic = in.nextLine();
      System.out.println(amics.get(amic));
    }
    in.close();
  }
}
