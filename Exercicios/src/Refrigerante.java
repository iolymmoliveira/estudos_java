public class Refrigerante {
  private String nome;
  private float preco;
  private int qtde;

  public Refrigerante (String nome, float preco, int qtde) {
    this.nome = nome;
    this.preco = preco;
    this.qtde = qtde;
  }

  public String getNome () {
    return this.nome;
  }

  public void SetNome (String nome) {
    this.nome = nome;
  }

  public float getPreco() {
      return this.preco;
    }

  public void setPreco (float preco) {
    this.preco = preco;
  }

  public int getQtde() {
    return this.qtde;
  }

  public void setQtde(int qtde) {
    this.qtde = qtde;
  }
}
