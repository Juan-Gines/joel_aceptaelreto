package Joel;

import java.util.Scanner;

public class NumerosBinaris {
  public static void main(String[] args) {
    Scanner in = new java.util.Scanner(System.in);
    int casos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < casos; i++) {
      String operacion = in.nextLine();
      String[] numeros = operacion.split(" ");
      int num1 = Integer.parseInt(numeros[0]);
      int num2 = Integer.parseInt(numeros[2]);
      String operador = numeros[1];
      if (operador.equals("+")) {
        System.out.println(Integer.toBinaryString(num1 + num2));
      } else if (operador.equals("-")) {
        System.out.println(Integer.toBinaryString(num1 - num2));
      } 
    }
    in.close();
  }
}
