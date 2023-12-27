package Joel;

import java.util.Scanner;

public class Murcielago {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    Boolean[] vocales = { false, false, false, false, false };
    String frase = in.nextLine();
    for (int j = 0; j < frase.length(); j++) {
      if (frase.charAt(j) == 'a')
        vocales[0] = true;
      if (frase.charAt(j) == 'e')
        vocales[1] = true;
      if (frase.charAt(j) == 'i')
        vocales[2] = true;
      if (frase.charAt(j) == 'o')
        vocales[3] = true;
      if (frase.charAt(j) == 'u')
        vocales[4] = true;
    }
    String resultado = "TOTES";

    for (boolean vocal : vocales) {
      System.out.println(vocal);
      if (!vocal)
        resultado = "FALTEN";
    }
    System.out.println(resultado);
    in.close();
  }
}
