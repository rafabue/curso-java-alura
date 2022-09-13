
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado: " + acompanhado);

	}

}
// O escopo de uma VARIÁVEL nasce quando abre se as chaves dela { e morre quando fechamos a chave } 
// Variáveis do tipo local, precisamos defina-lá e declarar para ela ser compilada 