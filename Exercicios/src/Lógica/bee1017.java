package Lógica;
import java.util.Scanner;

public class bee1017 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int tempoHoras = teclado.nextInt();
    int velMedia = teclado.nextInt();

    double distanciaP = tempoHoras * velMedia;
    double litros = distanciaP / 12;

    System.out.printf("%.3f", litros);
  }
}
