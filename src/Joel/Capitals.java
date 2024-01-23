package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitals {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, String> paisos = new HashMap<>();
      for (int j = 0; j < lineas - 1; j++) {
        String[] linea = in.nextLine().split("-");
        paisos.put(linea[0], linea[1]);
      }
      String pais = in.nextLine();
      if (paisos.containsKey(pais)) {
        System.out.println(paisos.get(pais));
      } else {
        System.out.println("NO HO SE");
      }
    }
    in.close();
  }
}
