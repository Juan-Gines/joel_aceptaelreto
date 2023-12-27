package Joel;

import java.util.Scanner;

public class Veri {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();

    for (int i = 0; i < casos; i++) {
      int energia = in.nextInt();
      int rammus = in.nextInt();
      int veri = in.nextInt();
      int contador = 0;
      String resultat = "";
      do {
        energia -= rammus;
        if (energia <= 0)
          resultat = "RAMMUS";
        else {
          energia -= veri;
          if (energia <= 0)
            resultat = "TWITCH";
        }
        contador++;
      } while (energia > 0);
      System.out.println(resultat + " " + contador);
    }
    in.close();
  }

}
