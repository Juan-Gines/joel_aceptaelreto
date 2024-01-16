package Joel;

import java.util.Scanner;

public class FansFnatic {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int partits = in.nextInt();
      in.nextLine();
      int victories = 0;
      int derrotes = 0;
      for (int j = 0; j < partits; j++) {
        String partit = in.nextLine();
        String[] equips = partit.split(" - ");
        if (equips[0].equals("Fnatic")) {
          victories++;
        }
        if (equips[1].equals("Fnatic")) {
          derrotes++;
        }
      }
      System.out.println(victories + " " + derrotes + " ");
    }
    in.close();      
  }
}
