package Lógica;
import java.util.Scanner;

public class bee1005 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double nota1, nota2, media;

    nota1 = teclado.nextDouble();
    nota2 = teclado.nextDouble();

    media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

    if (nota1 >= 0 && nota1<=10 && nota2 >= 0 && nota2 <=10) {
      System.out.printf("MEDIA = %.5f\n", media);
    }
  }
}
