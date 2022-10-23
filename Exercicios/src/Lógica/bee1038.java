package Lógica;
import java.util.Scanner;

public class bee1038 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int codigo, qtde;

    codigo = teclado.nextInt();
    qtde = teclado.nextInt();

    switch (codigo) {
      case 1:
        System.out.printf("Total: R$ %.2f\n", (qtde*4.00));
        break;
      case 2:
        System.out.printf("Total: R$ %.2f\n", (qtde*4.50));
        break;
      case 3:
        System.out.printf("Total: R$ %.2f\n", (qtde*5.00));
        break;
      case 4:
        System.out.printf("Total: R$ %.2f\n", (qtde*2.00));
        break;
      case 5:
        System.out.printf("Total: R$ %.2f\n", (qtde*1.50));
        break;
      default:
        break;
    }
  }
}
