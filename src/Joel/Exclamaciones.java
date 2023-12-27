package Joel;

import java.util.Scanner;

public class Exclamaciones {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    String frases;
    do {
      frases = in.nextLine();
      if (!frases.equals("FIN")) {
        int obertas = 0;
        int tancades = 0;
        for (int i = 0; i < frases.length(); i++) {
          if (frases.charAt(i) == '!') {
            tancades++;
          } else if (frases.charAt(i) == '¡') {
            obertas++;
          }
        }
        System.out.println(frases.charAt(0) == '¡');

        if (obertas == tancades) {
          System.out.println("SI");
        } else {
          System.out.println("NO");
        }
      }
    } while (!frases.equals("FIN"));
    in.close();
  }
}
