public class Conta {
	private double saldo;
	private int	agencia;
	private int	numero;
	private Cliente titular;
	private static int total;
	private static int total2 = 0;
	
	public static void main(String args[]) {
		Conta conta = new Conta(123,456);
		
	}
	public Conta() {
		total2 ++;
		System.out.println("Criando uma conta");
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta");
		System.out.println(Conta.getTotal2());
	}
	public static int getTotal2() {
		return Conta.total2;
	}
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
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

