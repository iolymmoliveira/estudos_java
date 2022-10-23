

public class Televisao {
  //Atributos:
  String marca;
  boolean ligada;
  int volume;
  int canal;

  //Métodos: (Função que não retorna valor => void)
  void ligar() {
    ligada = true;
    System.out.println("A TV " + marca + " está ligada!");
  }

  void aumentarVolume() {
    if (ligada) {
      volume ++;
      System.out.println("A TV " + marca + " está com volume " + volume);
    } else {
      System.out.println("Por favor, primeiro ligue a TV.");
    }
  }

  void avancarCanal() {
    if (ligada){
      canal ++;
      System.out.println("A TV " + marca + " está no canal " + canal);
    } else {
      System.out.println("Por favor, ligue a TV" + marca);
    }
  }

}
