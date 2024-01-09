package Joel;

import java.util.List;
import java.util.Scanner;

public class Frasindrom {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    boolean sortir = false;
    List<String> resultats = new java.util.ArrayList<>();
    do {
      String frase = in.nextLine();
      if (frase.equals("."))  sortir = true;
      String[] paraules = frase.split(" ");
      String resultat = "SI";
      for (int i = 0; i < paraules.length/2; i++) {
        if (!paraules[i].equals(paraules[paraules.length-i-1])) {
          resultat = "NO";
        }
      }
      if(!sortir) resultats.add(resultat);
    } while (!sortir);
    for (String r : resultats) {
      System.out.println(r);
    }
    in.close();      
  }
}
