
public class Loja {
	public static void main(String[] args) {
		//declaração 
		Carro c1, c2;
		
		c1 = new Carro();
		c2 = new Carro();
		
		c1.setMarca("Porcsche");
		c1.setModelo("Cayenne");
		c1.setAno(2022);
		c1.setKm(0);
		c1.setCor("Branco");
		c1.setPreco(2200000);
		
		c2.setMarca("Chevrolet");
		c2.setModelo("Corsa");
		c2.setAno(1998);
		c2.setKm(250000);
		c2.setCor("Prata");
		c2.setPreco(8000);
		
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
