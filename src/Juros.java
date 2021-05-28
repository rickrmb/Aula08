
public class Juros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorInicial = 1000;
		double taxaInvestimento = 10;
		int meses = 11;

		double valorFinal = calcularJuros(valorInicial, taxaInvestimento, meses);

		double lucro = calcularLucroJuros(valorInicial, taxaInvestimento, meses);

		System.out.println("Valor Total:" + valorFinal);
		System.out.println("      Lucro: " + lucro);
	}

	public static double calcularLucroJuros(double valor, double taxa, int quantidadeMeses) {
		double resultado = calcularJuros(valor, taxa, quantidadeMeses);
		return resultado - valor;

	}

	public static double calcularJuros(double valor, double taxa, int quantidadeMeses) {
		double resultado = valor;

		// recheio - calculo
		for (int i = 0; i < quantidadeMeses; i++) {
			resultado = resultado * (1.0 + (taxa / 100));

		}

		if(resultado > (valor*2)) {
			resultado = resultado * 0.5;
		}
		
		return resultado;
	}

}
