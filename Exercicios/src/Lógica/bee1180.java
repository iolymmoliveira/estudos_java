package Lógica;
import java.util.Scanner;

public class bee1180 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int N, menor, posMenor;
    N = teclado.nextInt();
    int X[] = new int[N];

    for (int i = 0; i < N; i++){
      X[i] = teclado.nextInt();
    }

    menor = X[0];
    posMenor = 0;
    for (int i = 0; i < X.length; i++){
      if ( X[i] < menor ){
        menor = X[i];  
        posMenor = i;
      } 
    }
    
    System.out.println("Menor valor: " + menor);
    System.out.println("Posicao: " + posMenor);
  }
}
