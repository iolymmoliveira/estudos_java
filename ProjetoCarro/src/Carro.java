//Definição do tipo de dado "Carro"
public class Carro {
	//características
	String marca;
	String modelo;
	int	   ano;
	String cor;
	int    km;
	double preco;
	
	//Método == funcionalidade	
	void exibirAnuncio () {
		System.out.println("Anúncio do Carro:");
		System.out.println(marca + "-" + modelo + "(" + ano + ")");
		System.out.println("Cor: " + cor + " Km: " + km + " R$ " + preco);
		System.out.println();
	}
	
	void simularSeguro(int perfil) {
		if (perfil == 0) {
			System.out.println("Perfil: Idoso - 1.5%");
			System.out.println("R$ " + preco * 0.015);
		}
		else if (perfil == 1) {
			System.out.println("Perfil: Chefe de Família - 2.5%");
			System.out.println("R$ " + preco * 0.025);
		}
		else if (perfil == 2) {
			System.out.println("Perfil: Jovem - 14%");
			System.out.println("R$ " + preco * 0.14);
		}
		else {
			System.out.println("Não possuimos este Perfil.");
			System.out.println();
		}
	}
	
	double calcularIPVA(){
		double valorIPVA;
		if (ano <= 2002) {
			valorIPVA = 0;
		}
		else {
			valorIPVA = preco * 0.035;
		}
		return valorIPVA;
	}
	
}
