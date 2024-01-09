package Joel;

import java.util.Scanner;

public class NoEsPatata {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frase = in.nextLine();
      String resultat = "No es Patata";
      if (frase.length() == 6) {
        if ((frase.charAt(0) == 'P' ||frase.charAt(0) == 'p') && 
            (frase.charAt(1) == 'a' ||frase.charAt(1) == 'A') && 
            (frase.charAt(2) == 't' ||frase.charAt(2) == 'T')&& 
            (frase.charAt(3) == 'a' ||frase.charAt(3) == 'A')&&  
            (frase.charAt(4) == 't' ||frase.charAt(4) == 'T') && 
            (frase.charAt(5) == 'a'|| frase.charAt(5) == 'A'))
          resultat = "Es Patata";
      }
      System.out.println(resultat);
    }
    in.close();      
  }
}
