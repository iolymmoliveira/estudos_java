public class AppPessoa {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    p.setNome ("Ioly Oliveira ");
    p.setEmail ("iolymmoliveira@gmail.com");
    p.setSalario (2000);

    p.exibirDados();
    p.aumentarSalario(15);
    p.exibirDados();
  
  }
}
