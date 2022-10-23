package Lógica;
import java.util.Scanner;

public class bee1036 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double A, B, C;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    double delta = (B * B) - (4 * A * C);
    

    if ( delta < 0 || A == 0) {
      System.out.println("Impossivel calcular");
    } else {
      double bhaskara1 = ( (- B) + (Math.sqrt(delta))) / ( 2 * A);
      double bhaskara2 = ( (- B) - (Math.sqrt(delta))) / ( 2 * A);

      System.out.printf("R1 = %.5f\n", bhaskara1);
      System.out.printf("R2 = %.5f\n", bhaskara2);
    }
  }
}
