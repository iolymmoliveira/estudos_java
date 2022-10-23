package Lógica;
import java.util.Scanner;

public class bee1073 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    int p;

    if (N > 5 && N < 2000){ //Testa se a entrada é um número válido
        for ( int i = 2; i <= N; i+=2) {
          p = (int) Math.pow(i, 2);
          System.out.println(i + "^2 = " + p);
        }
      } 
      
    }
  }


