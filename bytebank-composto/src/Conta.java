public class Conta {
	private double saldo;
	int	agencia;
	int	numero;
	Cliente titular;
	
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
}
// Aqui, temos uma classe e seus atributos: saldo; agencia; numero; titular //
// Nossa classe "Conta" seus atributos por padrão possuem valor (default) //
// O método "void" é dos métodos Java que não nos retorna nada // 
// O "this" usamos dentro de um método para referir-se a um atributo //
// O atributo "private" não pode ser modificado, e nem lido, a não ser pela sua própria classe //
//O método "get" usamos quando formos acessar, “pegar” alguns atributos da classe. Ele sempre retornará um valor, seja ele String, int, double etc //
//O método "set" usamos para alterar de maneira protegida os valores de um atributo da classe, ele não tras retorno, pois usavamos o void, porem ele deve receber algum argumento para que ocorra a alteração //