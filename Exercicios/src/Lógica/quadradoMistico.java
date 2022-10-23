package Lógica;
import java.util.Scanner;

public class quadradoMistico {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt();

    int e[][] = new int[n][n];

    for (int l = 0; l < n; l++) {
      for (int c = 0; c < n; c++) {
        e[l][c] = teclado.nextInt();
      }
    }

    int somaRef = 0;
    for (int c = 0; c < n; c++) {
      somaRef += e[0][c];
    }

    boolean qM = true;

    for(int l = 1; l <n && qM == true; l++) {
      int somaLinha = 0;
      for (int c = 0; c < n; c++) {
        somaLinha += e[l][c];
      }
      if (somaLinha != somaRef){
        qM = false;
      }
    }

    for(int c = 1; c <n && qM == true; c++) {
      int somaColuna = 0;
      for (int l = 0; l < n; l++) {
        somaColuna += e[l][c];
      }
      if (somaColuna != somaRef){
        qM = false;
      }
    }

    if (qM) {
      System.out.println("SIM");
    } else {
      System.out.println("NAO");
    }

  }
}
