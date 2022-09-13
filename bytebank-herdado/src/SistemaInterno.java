
public class SistemaInterno {
	
	private int senha;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso liberado ao sistema");
		} else {
			System.out.println("Acesso negado ao sistema");
		}
	}
}
