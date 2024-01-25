package Joel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EstamosTraviesos {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, String> correccions = new LinkedHashMap<>();
      for (int j = 0; j < lineas; j++) {
        String[] linea = in.nextLine().split("-");
        correccions.put(linea[0], linea[1]);
      }
      String[] frase = in.nextLine().split(" ");
      for (String paraula : frase) {
        if (correccions.containsKey(paraula)) {
          paraula = correccions.get(paraula);
        }
        System.out.print(paraula + " ");
      }
      System.out.println();
    }
    in.close();
  }
}
