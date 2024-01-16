package Joel;

import java.util.Scanner;

public class RallyDakar {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String cotxe = in.nextLine();
      String[] separat = cotxe.split(" ");
      int velocitat = Integer.parseInt(separat[0]);
      int velocitattotal = 0;
      for (int j = 1; j < separat.length; j++) {
        if(separat[j].equals("1")) {
          velocitattotal += velocitat;
        } else if (separat[j].equals("2")) {
          velocitattotal += velocitat / 2;
        } else if (separat[j].equals("3")) {
          velocitattotal += velocitat / 4;
        }
      }
      System.out.println(velocitattotal / (separat.length - 1));
    }
    in.close();
  }
}