package Joel;

import java.util.Scanner;

public class Raid {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String hora = in.nextLine();
      String[] separat = hora.split(":");
      int hores = Integer.parseInt(separat[0]);
      int minuts = Integer.parseInt(separat[1]);     
      if ((hores == 22 && minuts >= 30) || hores == 23 || (hores == 0 && minuts <= 30)) {
        System.out.println("RAID");
      } else {
        int minutsRestants = 60 * (22 - hores);
        if (minuts > 30) {
          minutsRestants += 60 - minuts + 30 - 60;
        } else {
          minutsRestants += 30 - minuts;
        }
        System.out.println(minutsRestants);
      }
    }
    in.close();
  }
}