package Lógica;
import java.util.Scanner;

public class bee2167 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int nMedidas = teclado.nextInt();
    
    int rpm[] = new int[nMedidas];

    for (int i=0; i<rpm.length; i++) {
      rpm[i] = teclado.nextInt();
    }

    int iQueda = 0;
    for (int i=1; i<rpm.length; i++){
      if(rpm[i] < rpm[i-1]){
        iQueda = i+1;
        break;
      }
    }
    System.out.println(iQueda);
  }
}
