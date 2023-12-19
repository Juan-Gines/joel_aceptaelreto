package Joel;

import java.util.Scanner;

public class AmbrosioTriangular {
     public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();               
        for (int i = 0; i < casos; i++) {
            int pisos = in.nextInt();
            int res=0;
            for (int j = 1; j <= pisos; j++) {
                for (int k = j; k >= 1; k--) {
                    res += k;
                }                
            }
            System.out.println(res);
        }
        
    }
}
