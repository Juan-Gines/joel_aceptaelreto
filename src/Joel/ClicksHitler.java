package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClicksHitler {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, String> links = new HashMap<>();
      for (int j = 0; j < lineas; j++) {
        String[] linea = in.nextLine().split("->");
        links.put(linea[0], linea[1]);
      }
      String inici = in.nextLine();
      int clicks = 0;
      boolean trobat = false;
      boolean imposible = false;
      do {
        if (inici.equals("HITLER"))
          trobat = true;
        else if (links.containsKey(inici)) {
          inici = links.get(inici);
          System.out.println(inici);
          clicks++;
        } else {
          imposible = true;
          trobat = true;
        }
      } while (!trobat);
      if (imposible)
        System.out.println("IMPOSSIBLE");
      else
        System.out.println(clicks);

    }
    in.close();
  }
}
