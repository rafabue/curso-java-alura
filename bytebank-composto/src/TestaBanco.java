
public class TestaBanco {

	public static void main(String[] args) {
		Cliente rafael = new Cliente();
		rafael.nome = "Rafael Siqueira";
		rafael.cpf = "091.848.699-84";
		rafael.profissao = "Programador";
		
		Conta contaDoRafael = new Conta();
		contaDoRafael.deposita(100);
		
		contaDoRafael.titular = rafael;
		System.out.println(contaDoRafael.titular.nome);
	}

}
