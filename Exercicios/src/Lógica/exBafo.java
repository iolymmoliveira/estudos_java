package Lógica;
import java.util.Scanner;

public class exBafo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int R, teste = 0;
    int A, B;

    int totalA, totalB;

    do {
      R = teclado.nextInt();
      if (R != 0) {
        teste++;
        totalA = 0;
        totalB = 0;
        for (int i = 0; i < R; i++) {
          A = teclado.nextInt();
          B = teclado.nextInt();
          totalA += A;
          totalB += B;
        }
        System.out.println("Teste: " + teste);
        if (totalA > totalB) {
          System.out.println("Aldo");
        } else {
          System.out.println("Beto");
        }
        System.out.println("");
      }
    } while (R != 0);
  }
}
