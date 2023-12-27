package Joel;

import java.util.Scanner;

public class TrasaCovid {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();

    for (int i = 0; i < casos; i++) {
      int dies = in.nextInt();
      String resultat = "OK";
      for (int j = 0; j < dies; j++) {
        int infectats = in.nextInt();
        if (infectats > 299) {
          resultat = "ALARMA";
        }
      }
      System.out.println(resultat);
    }
    in.close();

  }
}
