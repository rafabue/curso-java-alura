// Temos um contrato Autenticavel 
	// Quem assina esse contrato? Precisa implementar 
		// Métodos, são eles: setSenha e autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);	
	
	public abstract boolean autentica(int senha);
}

// Podemos pensar que uma "Interface" é uma classe ABSTRATA com todos os seus métodos também ABSTRATOS //
// Dentro de uma "Interface", por ser algo abstrato não temos nada concreto, ou seja, não no permite criar atributos //
// Para "assinar" um contrato, no java utilizamos a palavra chave: "implements" //
// Dentro de "Interfaces", métodos não podem ter implementações, tipo "if" "else" e etc //