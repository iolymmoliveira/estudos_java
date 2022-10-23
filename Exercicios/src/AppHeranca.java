

public class AppHeranca {
  public static void main(String[] args) {
    Pessoas p = new Pessoas("Ioly", "ioly@ioly.com");
    
    Funcionario f = new Funcionario("Renato", "renato@ioly.com", 8000);
    
    System.out.println("Mostrando infos.......");
    System.out.println(p);
    System.out.println(f);
  }
}
