public class PostoCombustivel {
  public static void main(String[] args) {
    BombaCombustivel bomba1 , bomba2;
    bomba1 = new BombaCombustivel("Gasolina", 7.4f);
    bomba2 = new BombaCombustivel("Etanol", 5.55f);
    
    bomba1.puxarGancho();
    bomba1.abastecerPorLitros(20);
    bomba1.voltarGancho();

    bomba2.puxarGancho();
    bomba2.abastecerPorValor(200.00f);
    bomba2.voltarGancho();
  }
}
