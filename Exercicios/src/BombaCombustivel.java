public class BombaCombustivel {
  private String combustivel;
  private float precoLitro;
  private float valorTotal;
  private float qtdeLitros;
  private boolean emAbastecimento;

  public BombaCombustivel(String combustivel, float preco) {
    this.combustivel = combustivel;
    this.precoLitro = preco;
    this.qtdeLitros = 0f;
    this.valorTotal = 0f;
    this.emAbastecimento = false;
  }

  public void puxarGancho() {
    this.emAbastecimento = true;
    this.valorTotal = 0.0f;
    this.qtdeLitros = 0.0f;
    System.out.println("Bomba " + this.combustivel + " pronta para abastecer veículo.");
  }

  public void voltarGancho() {
    this.emAbastecimento = false;
    System.out.println("+-----------------------------------------+");
    System.out.println("| Recibo Fiscal - Posto da Ioly |");
    System.out.println("+-----------------------------------------+");
    System.out.println("| Combustivel: " + this.combustivel);
    System.out.println("| Preço Litro R$ " + this.precoLitro);
    System.out.println("| Litros: " + this.qtdeLitros);
    System.out.println("| Valor Total R$ " + this.valorTotal); 
    System.out.println("+-----------------------------------------+");
    System.out.println("");
  }
  
  public void abastecerPorLitros(float litros) {
      if (this.emAbastecimento) {
        this.qtdeLitros = litros;
        this.valorTotal = this.precoLitro * this.qtdeLitros;
        System.out.println("Bomba " + combustivel + " em abastecimento.");
      } else {
        System.out.println("Tire o bico do gancho.");
      }
    }

  public void abastecerPorValor(float valor) {
    if (this.emAbastecimento) {
      this.valorTotal = valor;
      this.qtdeLitros = this.valorTotal / this.precoLitro;
      System.out.println("Bomba " + combustivel + " em abastecimento.");
    } else {
      System.out.println("Tire o bico do gancho.");
    }
  }
}
