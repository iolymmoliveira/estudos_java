package Lógica;
import java.util.Scanner;

public class bee1010 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int cod1,  num1;
    double valor1;

    cod1 = teclado.nextInt();
    num1 = teclado.nextInt();
    valor1 = teclado.nextDouble();

    int cod2, num2;
    double valor2;

    cod2 = teclado.nextInt();
    num2 = teclado.nextInt();
    valor2 = teclado.nextDouble();

    double pagar;

    pagar = (num1 * valor1) + (num2 * valor2);
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", pagar);
  }
}
