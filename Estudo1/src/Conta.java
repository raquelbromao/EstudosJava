public class Conta {
	//VARIÁVEIS/ATRIBUTOS
	private double balanco;
	
	//CONSTRUTOR
	public Conta (double balancoInicial) {
		if (balancoInicial > 0.0)
			balanco = balancoInicial;
	}
	
	//SET E GET
	public double getBalanco() {
		return balanco;
	}
	
	//MÉTODOS
	//Credita/Adiciona quantia a conta
	public void credito(double montante) {
		balanco = balanco + montante;
	}
	
}
