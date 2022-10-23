import java.util.Scanner;

public class LojaBebidas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    MaquinaDeRefrigerante m = new MaquinaDeRefrigerante();
    int opcao, res;
    float valor;

    do {
      System.out.println(m.mostrarInfo());
      System.out.println("Digite 99 para Inserir Credito");
      System.out.println("Digite -1 para Sair");
      System.out.println("Ou digite o numero do Refri (0-4) para comprar.");
      opcao = teclado.nextInt();

      switch (opcao) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
          res = m.comprar(opcao);
          if (res == 0) {
            System.out.println("Enjoy!!!");
          } else if (res == -1) {
            System.out.println("Saldo Insuficiente. Favor inserir mais $$$$$$.");
          } else {
            System.out.println("Desculpe! Este refrigerante esta em falta no momento. Volte mais tarde!");
          } 
          break;
        case 99:
          System.out.println("Digite o valor: ");
          valor = teclado.nextFloat();
          m.inserirCredito(valor);
          break;
        case -1:
          System.out.println("Obrigada por utilizar a maquina!");
          System.out.println("Receba seu troco " + m.solicitarTroco());
          break;
        default:
          System.out.println("Opcao Invalida!");
          break;
      }
    } while (opcao != -1);
  }
}
