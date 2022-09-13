
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
// Podemos criar getters e setters mesmo sem ter criado seus atributo, como exemplo de atributos criados nas linhas 4 à 6 //
// Mesmo não criando um construtor, o eclipse gera um por baixo dos panos como default //
// O método "protected" ele está entre o private e o public, ele é visivel apenas para os "filhos" daquela classe
// A palavra "super" no lugar do "this" usamos para dizer que aquele atributo vem da classe mãe, no caso a que usamos, funcionário.
// Uma classe "abstract" é algo que definimos como um conceito, algo abstrato, algo que nos dará referência para criar classe concretas, como os exemplos de tipos de funcionários //
// As classes que são "abstract" não permitem criar objetos a partir dela //
// Métodos "astracts" que não possuirem corpo, devem ser instanciados pelo seus filhos, herdeiros dessa classe/método //
// Quando colocamos um método como abstrato dentro de uma classe mãe, "obrigamos" seus filhos a instanciar/dar vida a esse método // 