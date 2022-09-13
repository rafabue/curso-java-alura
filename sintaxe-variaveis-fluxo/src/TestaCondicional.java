
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}
		else {
			if(quantidadePessoas >= 2)
			System.out.println("Você não tem 18, mas esta acompanhado, então pode entrar!");
		}

	}

}
//No java a condição "if" equivale a "se"
//No java a condição "else" equivale a "se não"
