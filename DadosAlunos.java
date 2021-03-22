package Alunos;

public class DadosAlunos {
	
	String nome;
	String cpf;
	String idade;
	String altura;
	String peso;
	String status;
	
	public DadosAlunos() {
	}
	
	public DadosAlunos(String nome, String cpf, String idade, String altura, String peso, String status) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.status = status;
	}
	
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
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getPeso() {
		return peso;
	}
	
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return nome + ". CPF:" + cpf + ". Idade:" + idade + ". Altura:" + altura + ". Peso:" + peso + ". Status:" + status;
	}

}
