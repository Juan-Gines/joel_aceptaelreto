package Joel;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Surtido2 {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int galetes = in.nextInt();
      in.nextLine();
      Map<String, Integer> capsa = new HashMap<>();
      for (int j = 0; j < galetes; j++) {
        String galeta = in.nextLine();
        if (capsa.containsKey(galeta)) {
          capsa.put(galeta, capsa.get(galeta) + 1);
        } else {
          capsa.put(galeta, 1);
        }
      }
      int surtidos = 0;
      boolean muntar = true;
      List<Integer> capsaOrdenadoDesc = new ArrayList<>(capsa.values());
      Collections.sort(capsaOrdenadoDesc, Comparator.reverseOrder());
      if (capsa.size() >= 3) {
        do {
          int maxGaletes = 3;
          for (int j = 0; j < capsaOrdenadoDesc.size(); j++) {
            if (capsaOrdenadoDesc.get(j) > 0 && maxGaletes > 0) {
              maxGaletes--;
              capsaOrdenadoDesc.set(j, capsaOrdenadoDesc.get(j) - 1);
            }
          }
          if (maxGaletes == 0) {
            surtidos++;
          } else {
            muntar = false;
          }
        } while (muntar);
      }
      System.out.println(surtidos);
    }
    in.close();
  }
}
