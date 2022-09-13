public abstract class Conta {
	
	protected double saldo;
	private int	agencia;
	private int	numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}	
}
	
	




















// Aqui, temos uma classe e seus atributos: saldo; agencia; numero; titular //
// Nossa classe "Conta" seus atributos por padrão possuem valor (default) //
// O método "void" é dos métodos Java que não nos retorna nada // 
// O "this" usamos dentro de um método para referir-se a um atributo //
// O atributo "private" não pode ser modificado, e nem lido, a não ser pela sua própria classe //
// O método "get" usamos quando formos acessar, “pegar” alguns atributos da classe. Ele sempre retornará um valor, seja ele String, int, double etc //
// O método "set" usamos para alterar de maneira protegida os valores de um atributo da classe, ele não tras retorno, pois usavamos o void, porem ele deve receber algum argumento para que ocorra a alteração //
// Um "construtor" pode receber parametros //
// Usamos o "static" para definir que o atributo pertence a classe, e não ao objeto em si //
// Construtores não são herdados, sempre precisamos reescreve-los ou cria-los dentro da nossa classe //
// Uma classe pode ter sim seus atributos, e os filhos podem herda-los //
// Uma classe pode também ter construtores, mas seus filhos devem cria-los dentro da sua classe //


