package Alunos;

public class Planos {
			
		String nome;
		String per�odo;
		String pre�o;
		
		public Planos() {
		}
		
		public Planos(String nome, String per�odo, String pre�o) {
			this.nome = nome;
			this.per�odo = per�odo;
			this.pre�o = pre�o;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getPer�odo() {
			return per�odo;
		}
		
		public void setPer�odo(String per�odo) {
			this.per�odo = per�odo;
		}
		
		public String getPre�o() {
			return pre�o;
		}
		
		public void setPre�o(String pre�o) {
			this.pre�o = pre�o;
		}
		
		@Override
		public String toString() {
			return nome + " - Per�odo:" + per�odo + " - Pre�o:" + pre�o;
		}

}
