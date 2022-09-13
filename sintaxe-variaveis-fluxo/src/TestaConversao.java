
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1300.00;
		float pontoFlutuante = 3.14f;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 258523235l;
		short valorPequeno = 3245;
		byte b = 127; // Vai até no máximo o 127 //
		
	}

}

// Na linha 8 fizemos um "cast" uma conversão forçada, para rodar um numero int sobre o double 
// Na linha 10 usamos o "l" no final do numero, por ser um literal muito grande, estamos confirmando que é aquele numero mesmo 
// Na linha 7 usamos o "f" no final para dizermos que o numero é do tipo ponto flutuante 
