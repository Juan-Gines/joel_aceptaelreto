package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JoanBrossa {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String frase = in.nextLine();      
      Map<Character, Integer> vocals = new HashMap<>();
      vocals.put('a', 0);
      vocals.put('e', 0);
      vocals.put('i', 0);
      vocals.put('o', 0);
      vocals.put('u', 0);
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
