
public class TestaValores {

	public static void main(String[] args) {
		int total = 0;
		Conta conta = new Conta(4290, 24940);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(450050);
		
		Conta contaSonia = new Conta(4290, 95100);
		Conta contaIzalda = new Conta(4290, 95500);
		
		System.out.println(Conta.getTotal());
	}

}
