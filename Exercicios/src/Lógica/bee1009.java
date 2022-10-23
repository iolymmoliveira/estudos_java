package Lógica;
import java.util.Scanner;

public class bee1009 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String nome;
    double salario, vendas;
    double comissao, salarioTotal;

    //System.out.println("Digite o nome: \n");
    nome = teclado.nextLine();

    //System.out.println("Digite o salário: \n");
    salario = teclado.nextDouble();

    //System.out.println("Digite o valor das vendas: \n");
    vendas = teclado.nextDouble();

    comissao = vendas * 15/100;
    salarioTotal = salario + comissao;

    System.out.printf("TOTAL: R$ %.2f\n", salarioTotal);
  }
}
