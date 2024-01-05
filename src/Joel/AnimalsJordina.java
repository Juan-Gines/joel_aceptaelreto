package Joel;

import java.util.Scanner;

public class AnimalsJordina {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();
        for (int i = 0; i < casos; i++) {
            int totalAnimals = in.nextInt();
            in.nextLine();
            String[] animals = new String[totalAnimals];
            String resultat = "NO";
            for (int j = 0; j < totalAnimals; j++) {
                animals[j] = in.nextLine();
            }
            for (int k = 0; k < animals.length - 1; k++) {
                if (animals[k].equals(animals[animals.length - 1]))
                    resultat = "SI";
            }
            System.out.println(resultat);
        }
        in.close();
    }
}