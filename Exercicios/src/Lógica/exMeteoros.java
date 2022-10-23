package Lógica;
import java.util.Scanner;

public class exMeteoros {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int X1, Y1, X2, Y2; // fazenda
    int X, Y; // meteorito
    int N; // número de meteoritos
    int contador = 0;
    int teste = 0;

    do {

      X1 = teclado.nextInt();
      Y1 = teclado.nextInt();
      X2 = teclado.nextInt();
      Y2 = teclado.nextInt();

      if (X1 != 0 || Y1 != 0 || X2 != 0 || Y2 != 0) {
        teste++;
        N = teclado.nextInt();
        contador = 0;
        for (int i = 0; i < N; i++) {
          X = teclado.nextInt();
          Y = teclado.nextInt();

          if (X >= X1 && X <= X2 && Y >= Y2 && Y <= Y1) {
            contador++;
          }
        }
        System.out.println("Teste " + teste);
        System.out.println(contador);
        System.out.println("");
      }
    } while (X1 != 0 || Y1 != 0 || X2 != 0 || Y2 != 0);
  }
}
