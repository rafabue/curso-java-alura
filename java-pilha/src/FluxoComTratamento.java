
public class FluxoComTratamento {

	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
	        	metodo1();
	        } catch (ArithmeticException | NullPointerException ex) {
	        	String msg = ex.getMessage();
            	System.out.println("Exception" + msg);
	        	ex.printStackTrace();
	        }
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	            	int a = i / 0;
//	            	Conta c = null;
//	            	c.deposita();
	        }
	        System.out.println("Fim do metodo2");
	    }
}

// Todo erro em Java, gera um tipo de "Exception" onde diz o que ocorreu, sempre irá possuir um nome.
// try significa tente, e ao usarmos, sempre irá precisar de chaves, assim como outros métodos.
// catch significa pegar, e ao usarmos, vamos atribuir a ele o tipo de exceção junto com a criação de uma variável como na linha 8.
// ArithmeticException é uma classe Java.
// Na linha 9, criamos uma nova variável e nela usamos o método que usa a referência "ex" da classe ArithmeticException, esse método nos traz a mensagem que defino o nome do erro.
// a linha 11 pegamos a referência e usamos o meétodo .printStackTrace para trazer o rastro que temos da pilha.
// Para usarmos duas excessões dentro do mesmo try catch, usamos o | para dividir, ex: ArithmeticException | NullPointerException.





