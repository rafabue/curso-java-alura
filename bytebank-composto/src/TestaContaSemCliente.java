
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaCarolina = new Conta();
		System.out.println(contaDaCarolina.getSaldo());
		
		contaDaCarolina.titular = new Cliente();
		System.out.println(contaDaCarolina.titular);
		
		contaDaCarolina.titular.nome = "Carolina";
		System.out.println(contaDaCarolina.titular.nome);
	}

}
// No java, o "null" é como se fosse o zero de uma variável/atributo do tipo referência, refere-se a lugar nenhum //