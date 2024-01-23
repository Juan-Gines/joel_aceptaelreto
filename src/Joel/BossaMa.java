package Joel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BossaMa {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int boses = in.nextInt();
    in.nextLine();
    Map<String, ArrayList<String>> bosesDb = new HashMap<>();
    for (int i = 0; i < boses; i++) {
      String bossa = in.nextLine();
      String[] bossaArr = bossa.split(" ");
      ArrayList<String> bossaArrList = new ArrayList<>();
      for (int j = 1; j < bossaArr.length; j++) {
        bossaArrList.add(bossaArr[j]);
      }
      bosesDb.put(bossaArr[0].substring(0, bossaArr[0].length() - 1), bossaArrList);
    }
    boolean sortir = false;
    do {
      String frase = in.nextLine();
      if (frase.equals("SURT")) {
        sortir = true;
      } else {
        String[] fraseArr = frase.split(" ");
        switch (fraseArr[0]) {
          case "MOUTOT":
            if (bosesDb.containsKey(fraseArr[1]) && bosesDb.containsKey(fraseArr[2])) {
              ArrayList<String> bossa1 = bosesDb.get(fraseArr[1]);
              if (!bossa1.isEmpty()) {
                ArrayList<String> bossa2 = bosesDb.get(fraseArr[2]);
                bossa2.addAll(bossa1);
                bossa1.clear();
              }
              System.out.println("SI");
            } else {
              System.out.println("NO");
            }
            break;
          case "MOSTRA":
            if (bosesDb.containsKey(fraseArr[1])) {
              ArrayList<String> bossa = bosesDb.get(fraseArr[1]);
              if (!bossa.isEmpty()) {
                for (String item : bossa) {
                  System.out.print(item + " ");
                }
                System.out.println();
              } else {
                System.out.println("RES");
              }
            } else {
              System.out.println("NO");
            }
            break;
          case "MOU":
            if (bosesDb.containsKey(fraseArr[2])) {
              ArrayList<String> bossa1 = bosesDb.get(fraseArr[2]);
              boolean trobat = false;
              for (Map.Entry<String, ArrayList<String>> entrybosa : bosesDb.entrySet()) {
                if (!trobat) {
                  if (entrybosa.getValue().contains(fraseArr[1])) {                   
                    entrybosa.getValue().remove(fraseArr[1]);
                    bossa1.add(fraseArr[1]);
                    trobat = true;
                  }
                }
              }
              if (!trobat)
                System.out.println("NO");
              else
                System.out.println("SI");
            } else {
              System.out.println("NO");
            }
            break;
          case "CERCA":
            boolean trobat = false;
            for (Map.Entry<String, ArrayList<String>> entrybosa : bosesDb.entrySet()) {
              if (entrybosa.getValue().contains(fraseArr[1])) {
                System.out.println(entrybosa.getKey());
                trobat = true;
              }
            }
            if (!trobat)
              System.out.println("NO");            
            break;
          default:
            break;
        }
      }

    } while (!sortir);
    System.out.println("FINS AVIAT!");
    in.close();
  }
}
