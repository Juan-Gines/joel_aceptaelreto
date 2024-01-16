package Joel;

import java.util.Scanner;

public class ComptarMinuscules {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frase = in.nextLine();
      int minuscules = 0;
      for (int j = 0; j < frase.length(); j++) {
        if (Character.isLowerCase(frase.charAt(j))) {
          minuscules++;
        }
      }
      System.out.println(minuscules);
    }
    in.close();
  }
}
