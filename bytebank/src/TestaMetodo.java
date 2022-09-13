
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRafael = new Conta();
		contaDoRafael.saldo = 100;
		contaDoRafael.deposita(50);
		System.out.println(contaDoRafael.saldo);
		boolean conseguiuRetirar = contaDoRafael.saca(20);
		System.out.println(contaDoRafael.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaCarolina = new Conta();
		contaDaCarolina.deposita(1000);
		boolean sucessoTransferencia = contaDaCarolina.transfere(3000, contaDoRafael);
		
		if(contaDaCarolina.transfere(300, contaDoRafael)) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println(contaDaCarolina.saldo);
		System.out.println(contaDoRafael.saldo);
		
		contaDoRafael.titular = "Rafael Siqueira";
		System.out.println();
	}

}

// Para invocar um método, obrigatoriamento usamos () //