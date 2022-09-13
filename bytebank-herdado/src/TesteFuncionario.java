public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente rafael = new Gerente();
		rafael.setNome("Rafael");
		rafael.setCpf("000000000-95");
		rafael.setSalario(3500.00);
		
		System.out.println(rafael.getNome());
		System.out.println(rafael.getBonificacao());
		
		rafael .getSalario();
	}

}
