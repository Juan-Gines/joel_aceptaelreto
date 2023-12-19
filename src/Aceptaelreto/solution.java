package Aceptaelreto;

import java.util.Arrays;

public class solution {

  static java.util.Scanner in;

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++) {
      String num = in.next();

      if (num == "6174") {
        System.out.println("0");
      } else {
        int contador = 0;
        while (!num.equals("6174")) {
          contador++;
          char[] numChar = num.toCharArray();
          int[] numInt = new int[numChar.length];
          for (int j = 0; j < numChar.length; j++) {
            numInt[j] = Character.getNumericValue(numChar[j]);
          }
          if (numInt[0] == numInt[1] && numInt[1] == numInt[2] && numInt[2] == numInt[3]) {
            num = "repdigits";
          }
          Arrays.sort(numInt);
          String numOrdenado = numInt[3] + "" + numInt[2] + "" + numInt[1] + "" + numInt[0];
          String numOrdenadoInverso = numInt[0] + "" + numInt[1] + "" + numInt[2] + "" + numInt[3];
          int numOrdenadoInt = Integer.parseInt(numOrdenado);
          int numOrdenadoInversoInt = Integer.parseInt(numOrdenadoInverso);
          int numFinal = numOrdenadoInt - numOrdenadoInversoInt;
          String resultado = Integer.toString(numFinal);
          if (resultado.length() < 4) {
            for (int k = resultado.length(); k < 4; k++) {
              resultado = "0" + resultado;
            }
          }
          num = resultado;
          if (num.equals("repdigits")) {
            contador = 8;
            num = "6174";
          }
        }
        System.out.println(contador);
      }
    }
  }
}