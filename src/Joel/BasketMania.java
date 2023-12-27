package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketMania {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();

    for (int i = 0; i < casos; i++) {
      int canastas = in.nextInt();
      Map<String, Integer> equips = new HashMap<String, Integer>();
      equips.put("V", 0);
      equips.put("L", 0);
      for (int j = 0; j < canastas; j++) {
        String equip = in.next();
        int punts = in.nextInt();
        equips.put(equip, equips.get(equip) + punts);
      }
      if (equips.get("V") > equips.get("L")) {
        System.out.println("V " + equips.get("L") + " " + equips.get("V"));
      } else if (equips.get("V") < equips.get("L")) {
        System.out.println("L " + equips.get("L") + " " + equips.get("V"));
      } else {
        System.out.println("E " + equips.get("L") + " " + equips.get("V"));
      }
    }
  }

}
