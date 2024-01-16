package Joel;

import java.util.Scanner;

public class Maionesera {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < casos; i++) {
            String inici = in.nextLine();
            String fi = in.nextLine();
            String hores = in.nextLine();
            int horesInici = Integer.parseInt(inici.substring(0, 2));
            String momentInici = inici.substring(6, 8);
            int horesFi = Integer.parseInt(fi.substring(0, 2));
            String momentFi = inici.substring(6, 8);
            int horesMax = Integer.parseInt(hores.substring(0, 2));
            String resultat = "NO";
            if (horesFi > horesInici && momentInici.equals(momentFi)) {
                if (horesFi - horesInici >= horesMax ) {
                    resultat = "SI";
                }
            }else if (horesFi > horesInici && !momentInici.equals(momentFi)){
                resultat = "SI";
            }else if (horesFi < horesInici) {
                if (24 - horesInici + horesFi >= horesMax) {
                    resultat = "SI";
                }
            }
            System.out.println(resultat);
        }
        in.close();
    }
}