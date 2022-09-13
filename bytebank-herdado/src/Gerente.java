
public class Gerente extends Funcionario implements Autenticavel { // "extends" ou herança, está nos dizendo que o Gerente pertence ou herda todas coisas da classe Funcionario //
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chama o método de bonificação do GERENTE");
		return super.getSalario();
	}
		
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
 
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}

// Podemos criar getters e setters mesmo sem ter criado seus atributo, como exemplo de atributos criados nas linhas 4 à 6 //
// Mesmo não criando um construtor, o eclipse gera um por baixo dos panos como default //
// 