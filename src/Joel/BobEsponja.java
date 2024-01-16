package Joel;

import java.util.Scanner;

public class BobEsponja {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frase = in.nextLine();
      boolean minuscules = true;
      String resultat = "";
      for (int j = 0; j < frase.length(); j++) {
        if (frase.charAt(j) != ' ') {
          if(minuscules) {
                resultat += Character.toLowerCase(frase.charAt(j));
                minuscules = false;
            }else {
                resultat += Character.toUpperCase(frase.charAt(j));
                minuscules = true;
            }
        }else {
            resultat += " ";
        }
      }
      System.out.println(resultat);
    }
    in.close();
  }
}