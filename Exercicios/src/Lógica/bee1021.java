package Lógica;
import java.util.Scanner;

public class bee1021 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double valorMonetario = teclado.nextDouble();
    int resto, valorNotas, valorMoedas;
    int nota100, nota50, nota20, nota10, nota5, nota2,
        moeda1, moeda50, moeda25, moeda10, moeda05, moeda01;

    valorNotas = (int) valorMonetario;
    valorMonetario = valorMonetario - valorNotas;
    valorMoedas = (int) (valorMonetario * 100);

    nota100 = valorNotas / 100;
    resto = valorNotas % 100;
    nota50 = resto / 50;
    resto = resto % 50;
    nota20 = resto / 20;
    resto = resto % 20;
    nota10 = resto / 10;
    resto = resto % 10;
    nota5 = resto / 5;
    resto = resto % 5;
    nota2 = resto / 2;
    moeda1 = resto % 2;

    moeda50 = valorMoedas / 50;
    resto = valorMoedas % 50;
    moeda25 = resto / 25;
    resto = resto % 25;
    moeda10 = resto / 10;
    resto = resto % 10;
    moeda05 = resto / 5;
    moeda01 = resto % 5;


    System.out.println("NOTAS:\n");
    System.out.println(nota100 +" nota (s) de R$ 100.00\n");
    System.out.println(nota50 +" nota (s) de R$ 50.00\n");
    System.out.println(nota20 +" nota (s) de R$ 20.00\n");
    System.out.println(nota10 +" nota (s) de R$ 10.00\n");
    System.out.println(nota5 +" nota (s) de R$ 5.00\n");
    System.out.println(nota2 +" nota (s) de R$ 2.00\n");
    System.out.println("MOEDAS:\n");
    System.out.println(moeda1 +" moeda (s) de R$ 1.00\n");
    System.out.println(moeda50 +" moeda (s) de R$ 0.50\n");
    System.out.println(moeda25 +" moeda (s) de R$ 0.25\n");
    System.out.println(moeda10 +" moeda (s) de R$ 0.10\n");
    System.out.println(moeda05 +" moeda (s) de R$ 0.05\n");
    System.out.println(moeda01 +" moeda (s) de R$ 0.01\n");
   
  }
}
