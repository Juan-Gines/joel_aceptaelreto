package Joel;

import java.util.Scanner;

public class BloodborneStrings {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < casos; i++) {
            String paraula = in.nextLine();
            String resultat = "NO";
            for (int j = 0; j < paraula.length() - 1; j++) {
                if (paraula.charAt(j) == paraula.charAt(j + 1))
                    resultat = "SI";
            }
            System.out.println(resultat);
        }
        in.close();
    }
}