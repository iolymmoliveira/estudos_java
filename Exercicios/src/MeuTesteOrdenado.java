import java.util.ArrayList;
import java.util.Collections;

public class MeuTesteOrdenado {
  public static void main(String[] args) {
    
    ArrayList<Player> lista = new ArrayList<Player>();

    lista.add(new Player (1, "VenomousInk87", 100.0f));
    lista.add(new Player (2, "BullDog897", 87.5f));
    lista.add(new Player (3, "PlayerFromHell", 50.0f));
    lista.add(new Player (4, "PhonicDyno", 200.0f));
    lista.add(new Player (5, "KillOthers", 50.0f));

    System.out.println("***** IMPRIMINDO A LISTA *****");

    // ordenar os valores 
    Collections.sort(lista);

    for (Player p: lista) {
      System.out.println("Player = " + p);
    }
  }
}
