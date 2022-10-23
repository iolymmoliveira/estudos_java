package Lógica;
import java.util.Scanner;

public class bee1064 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float valor, somaPositivo, media;
    int contPositivo = 0;
    somaPositivo = 0;

    for (int cont = 0; cont < 6; cont++) {
      valor = teclado.nextFloat();
      
      if (valor > 0) {
        contPositivo++;
        somaPositivo += valor;
      }
    }

    media = somaPositivo / contPositivo;
    System.out.println(contPositivo + " valores positivos ");
    System.out.printf("%.1f\n", media);
  }
}