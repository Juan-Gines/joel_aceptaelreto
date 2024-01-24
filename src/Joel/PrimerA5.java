package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrimerA5 {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    boolean sortir = false;
    boolean primera5 = false;
    String primer = "NO";
    Map<String, Integer> guanyadors = new HashMap<>();
    do {
      String guanyador = in.nextLine();
      if (guanyador.equals("xxx")) {
        sortir = true;
      } else if (guanyadors.containsKey(guanyador)) {
        guanyadors.put(guanyador, guanyadors.get(guanyador) + 1);
        if (!primera5 && guanyadors.get(guanyador) == 5) {
          primer = guanyador;
          primera5 = true;
        }
      } else {
        guanyadors.put(guanyador, 1);
      }
    } while (!sortir);
    System.out.println(primer);
    in.close();
  }
}
