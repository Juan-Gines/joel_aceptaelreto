package Joel;

import java.util.Arrays;
import java.util.Scanner;

public class Contrasenyes {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int mida = in.nextInt();
    String[] usuaris = new String[mida];
    String[] contrasenyes = new String[mida];
    in.nextLine();
    for (int i = 0; i < mida; i++) {
      usuaris[i] = in.next();
    }
    for (int i = 0; i < mida; i++) {
      contrasenyes[i] = in.next();
    }
    in.nextLine();
    int intents = in.nextInt();
    in.nextLine();
    for (int i = 0; i < intents; i++) {
      String usuari = in.next();
      String contrasenya = in.next();
      in.nextLine();
      String resultat = "usuari no trobat";
      boolean trobat = false;
      for (int j = 0; j < mida && !trobat; j++) {
        if (usuari.equals(usuaris[j])) {
          resultat = "contrasenya incorrecta";
          if (contrasenya.equals(contrasenyes[j])){
            resultat = "OK";
            trobat = true;
          }
        }
      }
      System.out.println(resultat);
    }
    Arrays.sort(usuaris);
    for(String u : usuaris){
      System.out.print(u + " ");
    }
    in.close();
  }
}