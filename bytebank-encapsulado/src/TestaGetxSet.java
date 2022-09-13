
public class TestaGetxSet {

	public static void main(String[] args) {
		Conta conta = new Conta(4290, 24940);
		conta.setNumero(4290);
		System.out.println(conta.getNumero());
		
		Cliente rafael = new Cliente();
		// conta.titular = rafael;
		rafael.setNome ("Rafael Siqueira");
		
		conta.setTitular(rafael);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas mas com o mesmo resultado acima:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
	}

}
