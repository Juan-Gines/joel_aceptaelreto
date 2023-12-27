package Joel;

import java.util.Scanner;

public class PiramideCartas {

  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();

    for (int i = 0; i < casos; i++) {
      int cartas = in.nextInt();
      int contador = 0;
      int resta = 0;
      int cartasRestantes = cartas;
      if (cartas == 1) {
        cartasRestantes = 1;
      } else {
        for (int j = 2; resta < cartas; j += 3) {
          resta += j;
          if (cartas >= resta) {
            contador++;
            cartasRestantes = cartas - resta;
          }
        }
      }

      System.out.println(contador + " " + cartasRestantes);
    }
  }

}
