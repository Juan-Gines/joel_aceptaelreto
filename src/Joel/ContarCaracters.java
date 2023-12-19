package Joel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ContarCaracters {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        List<Integer> letras = new ArrayList<Integer>();
        String frase = "";
        while (!frase.equals("FI")) {
            frase = in.nextLine();
            int contador = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (Character.isLetter(frase.charAt(i))) {
                    contador++;
                }
            } 
            if(!frase.equals("FI"))letras.add(contador);          
        }
        for (int i = 0; i < letras.size(); i++) {
            System.out.print(letras.get(i) + " ");
        }        
    }
}
