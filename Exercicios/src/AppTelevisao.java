

public class AppTelevisao {
  public static void main(String[] args) {
    int a;
    String b;

    Televisao t1 = new Televisao();
    Televisao t2 = new Televisao();

    t1.marca = "LG";
    t1.ligada = false;
    t1.volume = 0;
    t1.canal = 5;

    t2.marca = "Samsung da Sala";
    t2.ligada = true;
    t2.volume = 5;
    t2.canal = 850;

    t1.ligar();
    t1.aumentarVolume();
    t1.avancarCanal();

    t2.aumentarVolume();
    t2.avancarCanal();
  }
}
