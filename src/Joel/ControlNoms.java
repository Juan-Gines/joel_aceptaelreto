package Joel;

import java.util.Scanner;

public class ControlNoms {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        String ranq = in.nextLine();
        String resultado = "NO";
        for (int i = 0; i < ranq.length(); i++) {
            if (ranq.charAt(0) != ranq.charAt(i)) {
                resultado = "SI";
                break;
            }
        }
        System.out.println(resultado);
        in.close();
    }
}
