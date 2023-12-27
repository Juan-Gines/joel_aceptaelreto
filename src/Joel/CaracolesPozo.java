package Joel;

import java.util.Scanner;

public class CaracolesPozo {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();

    for (int i = 0; i < casos; i++) {
      int profunditat = in.nextInt();
      int dia = in.nextInt();
      int nit = in.nextInt();
      int contador = 0;
      if (dia >= profunditat) {
        System.out.println(1);
      } else {
        if (dia > nit) {
          do {
            profunditat -= dia;
            contador++;
            if (profunditat > 0) {
              profunditat += nit;
            }
          } while (profunditat > 0);
          System.out.println(contador);
        } else {
          System.out.println("NO");
        }
      }

    }
  }

}
