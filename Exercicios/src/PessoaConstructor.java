public class PessoaConstructor {
  private String nome;
  private String email;
  private float salario;

  //Constructor
  public PessoaConstructor (String nome, String email, float salario) {
    this.nome = nome;
    this.email = email;
    this.salario = salario;
  }

  //Métodos para Acessar e Modificar cada atributo
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail(){
    return this.email;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }
  public float getSalario(){
    return this.salario;
  }

  //Outros Métodos
  public void aumentarSalario(float indice){
    salario = salario + ((indice/100)*salario);
  }

  public void exibirDados() {
    System.out.println("Sistema Pessoa *****");
    System.out.println("Nome: " + nome + " (" + email + ")");
    System.out.println("Salario R$ " + salario);
  }
}
