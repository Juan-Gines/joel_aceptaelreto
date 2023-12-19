package Aceptaelreto;

import java.util.Arrays;

public class ConstanteKaprecar {
  static java.util.Scanner in;

  public static void casoDePrueba() {
    String num = in.next();

    if (num == "6174") {
      System.out.println("0");
    } else {
      int contador = 0;
      while (!num.equals("6174")) {
        contador++;
        num = ordenarNumero(num);
        if (num.equals("repdigits")) {
          contador = 8;
          num = "6174";
        }
      }
      System.out.println(contador);
    }
  }

  public static String ordenarNumero(String num) {
    char[] numChar = num.toCharArray();
    int[] numInt = new int[numChar.length];
    for (int i = 0; i < numChar.length; i++) {
      numInt[i] = Character.getNumericValue(numChar[i]);
    }
    if (numInt[0] == numInt[1] && numInt[1] == numInt[2] && numInt[2] == numInt[3]) {
      return "repdigits";
    }
    Arrays.sort(numInt);
    String numOrdenado = numInt[3] + "" + numInt[2] + "" + numInt[1] + "" + numInt[0];
    String numOrdenadoInverso = numInt[0] + "" + numInt[1] + "" + numInt[2] + "" + numInt[3];
    int numOrdenadoInt = Integer.parseInt(numOrdenado);
    int numOrdenadoInversoInt = Integer.parseInt(numOrdenadoInverso);
    int numFinal = numOrdenadoInt - numOrdenadoInversoInt;
    String resultado = Integer.toString(numFinal);
    if (resultado.length() < 4) {
      for (int i = resultado.length(); i < 4; i++) {
        resultado = "0" + resultado;
      }
    }
    return resultado;
  }

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();
  }
}
