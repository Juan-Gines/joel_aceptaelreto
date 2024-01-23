package Joel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampioProgramame {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      List<String> guanyadors = new ArrayList<>();
      for (int j = 0; j < lineas-1; j++) {
        String[] linea = in.nextLine().split("-");
        guanyadors.add(linea[1]);
      }
      int quantitat = 0;
      String guanyador = in.nextLine();
      if (guanyadors.contains(guanyador)) {
        for (String s : guanyadors) {
          if (s.equals(guanyador)) {
            quantitat++;
          }
        }
      }
      System.out.println(quantitat);
    }
    in.close();
  }
}
