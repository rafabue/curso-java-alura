
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(12345);
		
		Administrador adm = new Administrador();
		adm.setSenha(12345);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(123405);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		si.autentica(adm);
		
	}

}
