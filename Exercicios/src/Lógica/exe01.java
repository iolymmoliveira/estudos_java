package Lógica;
import java.util.Scanner;
import java.util.function.Function;

public class exe01 {
  private static final String Function = null;

  public static void main(String[] args) {
    
    int []array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 73};

    for (int i = 0; i < array.length; i++) {
      if (verificaPrimo(array[i])) {
        System.out.println(array[i]);
      }
    }

    //Letra A - 3, 5, 7, 9, 73
    /*
    boolean verificaPrimo(int n) {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          return false;
        } else {
          return true;
        }
      }
    }
    */


    //Letra B - Não retorna nenhum valor
    /*
    function verificaPrimo(n) {
      for (let i = 1; i < n; i++) {
        if (n % i == 0) {
          return false;
        } else {
          return true;
        }
      }
    }
    */

    //Letra C - 3, 4, 5, 6, 7, 8, 9, 73
    /*
    function verificaPrimo(n) {
      for (let i = 2; i < n; i++) {
        if (n / i == 0) {
          return false;
        } else {
          return true;
        }
      }
    }
    */

    //Letra D 3, 5, 7, 9, 73
    /*
    function verificaPrimo(n) {
      for (let i = 2; i <= n; i++) {
        if (n % i == 0) {
          return false;
        } else {
          return true;
        }
      }
    }
    */

  }

  private static boolean verificaPrimo(int i) {
    return false;
  }

}