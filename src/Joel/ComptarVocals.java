package Joel;

import java.util.Scanner;

public class ComptarVocals {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frase = in.nextLine();
      int contador = 0;
      for (int j = 0; j < frase.length() - 1; j++) {
        if (frase.charAt(j) == 'L' && frase.charAt(j + 1) == 'a' ||
            frase.charAt(j) == 'L' && frase.charAt(j + 1) == 'A' ||
            frase.charAt(j) == 'l' && frase.charAt(j + 1) == 'a' ||
            frase.charAt(j) == 'l' && frase.charAt(j + 1) == 'A') {
          contador++;
        }
      }
      System.out.println(contador);
    }
    in.close();
  }
}
