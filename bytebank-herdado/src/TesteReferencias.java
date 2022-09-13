
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Rafael");
		g.setSalario(5000);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Jheniffer");
		ev.setSalario(1500);
		
		Designer d = new Designer();
		d.setNome("José");
		d.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}

// O polimorfismo se trata de um objeto que pode ser referenciado por uma referência do mesmo tipo, ou genérica //

