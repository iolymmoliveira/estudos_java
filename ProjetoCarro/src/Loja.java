
public class Loja {
	public static void main(String[] args) {
		//declaração 
		Carro c1, c2;
		
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "Porcsche";
		c1.modelo = "Cayenne";
		c1.ano = 2022;
		c1.km = 0;
		c1.cor = "Branco";
		c1.preco = 2200000;
		
		c2.marca = "Chevrolet";
		c2.modelo = "Corsa";
		c2.ano = 1998;
		c2.km = 250000;
		c2.cor = "Prata";
		c2.preco = 8000;
		
		c1.exibirAnuncio();
		c1.simularSeguro(2);
		System.out.println();
		
		c2.exibirAnuncio();
		c2.simularSeguro(3);
		System.out.println();
		
		System.out.println("---- Calculando IPVA dos Veículos ----");
		System.out.println();
		
		double ipvaC1 = c1.calcularIPVA();
		double ipvaC2 = c2.calcularIPVA();
		
		if(ipvaC1 == 0) {
			System.out.println("Veículo Isento");
		} 
		else {
			System.out.println("Valor do IPVA R$: " + ipvaC1);
		}
		
		if(ipvaC2 == 0) {
			System.out.println("Veículo Isento do Imposto");
		} 
		else {
			System.out.println("Valor do IPVA R$: " + ipvaC2);
		}
	}
}
