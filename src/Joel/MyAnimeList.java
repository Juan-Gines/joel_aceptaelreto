package Joel;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyAnimeList {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    for (int i = 0; i < casos; i++) {
      int lineas = in.nextInt();
      in.nextLine();
      Map<String, Integer> animes = new LinkedHashMap<>();
      for (int j = 0; j < lineas; j++) {
        String[] linea = in.nextLine().split("-");
        animes.put(linea[0], Integer.parseInt(linea[1]));
      }
      int max = 0;
      int min = 10;
      int suma = 0;
      String millor = "";
      String pitjor = "";
      for (Map.Entry<String, Integer> anime : animes.entrySet()) {
        if (anime.getValue() >= max) {
          max = anime.getValue();
          millor = anime.getKey();
        }
        if (anime.getValue() <= min) {
          min = anime.getValue();
          pitjor = anime.getKey();
        }
        suma += anime.getValue();
      }
      DecimalFormat format = new DecimalFormat("#0.00");
      String avg = format.format((double) suma / lineas);

      System.out.println(avg + " " + pitjor + " " + millor);
    }
    in.close();
  }
}
