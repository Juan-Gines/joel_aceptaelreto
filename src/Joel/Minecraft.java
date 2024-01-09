package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Minecraft {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frase = in.nextLine();      
      Map<Character, Integer> vocals = new HashMap<>();      
      for (int j=0; j<frase.length(); j++){
        if(vocals.containsKey(frase.charAt(j))) 
          vocals.put(frase.charAt(j), vocals.get(frase.charAt(j)) + 1);        
      }
      char resultat = ' ';
      int max = 0;
      for (char key : vocals.keySet()) {
        if(vocals.get(key) > max) {
          max = vocals.get(key);
          resultat = key;
        }        
      }
      System.out.println("Vocal guanyadora: " + resultat);
    }
    in.close();
  }
}
