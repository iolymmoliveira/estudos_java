import java.nio.channels.ClosedByInterruptException;

public class ClienteVip extends Cliente {
  private float creditoExtra;

  public ClienteVip(String nome, String email, float credito, float creditoExtra){
    super(nome, email, credito);
    this.creditoExtra = creditoExtra;
  }

  public String toString(){
    return "(VIP) "+ super.toString() + " Credito Extra R$ " + creditoExtra;
  }

  public boolean fazerCompra(float valor){
    if(valor > (creditoExtra + super.getCredito())){
      return false;
    } else {
      super.setCredito(super.getCredito() - valor);
      return true;
    }
  }
}
