package Lógica;
import java.util.Scanner;

public class bee1008 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numFunc, numHoras;
    double valorHora, salario;

    numFunc = teclado.nextInt();
    numHoras = teclado.nextInt();
    valorHora = teclado.nextDouble();

    salario = numHoras * valorHora;

    System.out.println("NUMBER = " + numFunc);
    System.out.printf("SALARY = U$ %.2f\n", salario);
  }
}
