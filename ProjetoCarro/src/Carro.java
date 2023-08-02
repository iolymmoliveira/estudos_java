//Definição do tipo de dado "Carro"
public class Carro {
	// -----  Atributos == características ----- //
	private String marca;
	private String modelo;
	private int	   ano;
	private String cor;
	private int    km;
	private double preco;
	// ----------------------------------------- //
	
	// ----- Getters and Setters ----- //
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;					//This dos setters sempre se referem ao atributo. 
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}	
	// ------------------------------ //

	//  ----- Métodos == Funcionalidades  ----- //	
	public void exibirAnuncio () {
		System.out.println("Anúncio do Carro:");
		System.out.println(this.marca + "-" + this.modelo + "(" + this.ano + ")");
		System.out.println("Cor: " + this.cor + " Km: " + this.km + " R$ " + this.preco);
		System.out.println();
	}
	
	public void simularSeguro(int perfil) {
		if (perfil == 0) {
			System.out.println("Perfil: Idoso - 1.5%");
			System.out.println("R$ " + this.preco * 0.015);
		}
		else if (perfil == 1) {
			System.out.println("Perfil: Chefe de Família - 2.5%");
			System.out.println("R$ " + this.preco * 0.025);
		}
		else if (perfil == 2) {
			System.out.println("Perfil: Jovem - 14%");
			System.out.println("R$ " + this.preco * 0.14);
		}
		else {
			System.out.println("Não possuimos este Perfil.");
			System.out.println();
		}
	}
	
	public double calcularIPVA(){
		double valorIPVA;
		if (this.ano <= 2002) {
			valorIPVA = 0;
		}
		else {
			valorIPVA = this.preco * 0.035;
		}
		return valorIPVA;
	}
//  ----------------------------------------- //	
	
}
