class Conta {
	double	saldo;
	int	agencia;
	int	numero;
	String titular;
	
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
}
// Aqui, temos uma classe e seus atributos: saldo; agencia; numero; titular; //
// Nossa classe "Conta" seus atributos por padrão possuem valor (default). //
// O método "void" é dos métodos Java que não nos retorna nada. // 
// O "this" usamos dentro de um método para referir-se a um atributo //