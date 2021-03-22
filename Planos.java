package Alunos;

public class Planos {
			
		String nome;
		String período;
		String preço;
		
		public Planos() {
		}
		
		public Planos(String nome, String período, String preço) {
			this.nome = nome;
			this.período = período;
			this.preço = preço;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getPeríodo() {
			return período;
		}
		
		public void setPeríodo(String período) {
			this.período = período;
		}
		
		public String getPreço() {
			return preço;
		}
		
		public void setPreço(String preço) {
			this.preço = preço;
		}
		
		@Override
		public String toString() {
			return nome + " - Período:" + período + " - Preço:" + preço;
		}

}
