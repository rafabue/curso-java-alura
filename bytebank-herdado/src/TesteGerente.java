
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Rafael");
		g1.setCpf("000000000-95");
		g1.setSalario(10000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(280558);
		boolean autenticou = g1.autentica(280558);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}