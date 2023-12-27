package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumarPosNeg {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);

    Map<String, Integer> contadorNumeros = new HashMap<String, Integer>();
    contadorNumeros.put("positius", 0);
    contadorNumeros.put("negatius", 0);
    String resultat = "POSITIUS";
    int num = 0;
    do {
      num = in.nextInt();
      if (num < 0) {
        contadorNumeros.put("negatius", contadorNumeros.get("negatius") + 1);
      }
      if (num > 0) {
        contadorNumeros.put("positius", contadorNumeros.get("positius") + 1);
      }
    } while (num != 0);
    if (contadorNumeros.get("positius") > contadorNumeros.get("negatius")) {
      resultat = "POSITIUS";
    } else if (contadorNumeros.get("positius") < contadorNumeros.get("negatius")) {
      resultat = "NEGATIUS";
    } else {
      resultat = "IGUALS";
    }
    System.out.println(resultat);
  }
}
