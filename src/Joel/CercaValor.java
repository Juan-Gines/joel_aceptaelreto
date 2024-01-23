package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CercaValor {
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
      String capital = in.nextLine();
      System.out.println(paisos);
      paisos.forEach((key, value) -> {
        if (value.equals(capital)) {
          System.out.println(key);
        }
      });
    }
    in.close();
  }
}
