package Lógica;
import java.util.Scanner;

public class bee1004 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int valor1, valor2, produto;

    valor1 = teclado.nextInt();
    valor2 = teclado.nextInt();

    produto = valor1 * valor2;

    System.out.println("PROD = " + produto);
  }
}
