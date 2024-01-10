package Joel;

import java.util.Scanner;

public class Rimador {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frases = in.nextLine();
      String[] frase = frases.split(",");
      int indice = 1;
      String resultat = "";
      while (frase[0].length() - indice >= 0
          && frase[0].charAt(frase[0].length() - indice) == frase[1].charAt(frase[1].length() - indice)) {
        resultat = frase[0].charAt(frase[0].length() - indice) + resultat;
        indice++;
      }
      if (resultat.isEmpty())
        System.out.println("#");
      else
        System.out.println(resultat);
    }
    in.close();
  }
}
