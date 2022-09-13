
public class TestaWhile {

	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			contador = contador +1; // equivale a "contador++;"
		}
	}

}
// While equivale a "enquanto" 
// While assim como if e else, só retorna expressão boolean ou "true" ou "false"
// Variável do tipo local, precisa de um valor para ser definida, seja "0", o java não permite compilar com o espaço vazio (linha 5) 
// While ao usar uma variável, ela precisa estar declarada como citado acima 

