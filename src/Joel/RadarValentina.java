package Joel;

import java.util.Scanner;

public class RadarValentina {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();

    for (int i = 0; i < casos; i++) {
      String resultat = "H";
      for (int j = 0; j < 5; j++) {
        int energia = in.nextInt();
        if (resultat == "H" && energia >= 1000 && energia < 10000) {
          resultat = "B";
        } else if (energia >= 10000) {
          resultat = "M";
        }
      }
      System.out.println(resultat);
    }

  }
}
