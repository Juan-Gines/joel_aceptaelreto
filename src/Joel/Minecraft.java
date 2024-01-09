package Joel;

import java.util.Scanner;

public class Minecraft {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int pasadisos = in.nextInt();
      in.nextLine();
      int diamants = 0;      
      for (int j = 0; j < pasadisos; j++) {
        String pasadis = in.nextLine();
        for (int k = 0; k < pasadis.length() - 1; k++) {
          if (pasadis.charAt(k) == '{' && pasadis.charAt(k + 1) == '}') {
            diamants++;
          }
        }
      }
      System.out.println(diamants);
    }
    in.close();
  }
}
