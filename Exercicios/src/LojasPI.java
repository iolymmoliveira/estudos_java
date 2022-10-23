public class LojasPI {
  public static void main(String[] args) {
    Cliente[] clientes;

    clientes = new Cliente[5];

    clientes[0] = new Cliente("Isidro", "isidro@isidro.com", 500);
    clientes[1] = new ClienteVip("Vitor", "vitor@vit.com", 500, 300);
    clientes[2] = new Cliente("Jose", "jose@jose.com", 300);
    clientes[3] = new Cliente("Pedro", "pedro@pedro.com", 1000);
    clientes[4] = new ClienteVip("Andre", "andre@andre.com", 1000, 500);

    for (Cliente c : clientes) {
      System.out.println(c);
    }

  }
}
