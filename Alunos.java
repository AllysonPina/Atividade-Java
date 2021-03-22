package Alunos;

import java.util.ArrayList;

public class Alunos {

	public static void main(String[] args) {
		
		ArrayList<DadosAlunos> Alunos = new ArrayList<DadosAlunos>();
		
		DadosAlunos DadosAlunos = new DadosAlunos("Pedro Ferreira", "109.322.876-99", "22", "182cm", "70kg", "ativo");
		DadosAlunos DadosAlunos1 = new DadosAlunos("Tay Gomes", "111.387.325-79", "25", "170cm", "61kg", "ativo");
		
		Alunos.add(DadosAlunos);
		Alunos.add(DadosAlunos1);
		
		for (DadosAlunos A : Alunos) {
			System.out.println("Aluno: \n" + A);
		}
		
		ArrayList<DadosAlunosII> AlunosII = new ArrayList<DadosAlunosII>();
		
		DadosAlunosII DadosAlunos2 = new DadosAlunosII("Marta Silva", "109.372.356-91", "32", "167cm", "56kg", "não ativo");
		DadosAlunosII DadosAlunos3 = new DadosAlunosII("Lucas Souza", "102.252.776-67", "18", "178cm", "86kg", "não ativo");
		
		AlunosII.add(DadosAlunos2);
		AlunosII.add(DadosAlunos3);
		
		for(DadosAlunosII A2 : AlunosII) {
			System.out.println("Aluno: \n" + A2);
		}

		ArrayList<Planos> Planos = new ArrayList<Planos>();
		
		Planos Planos1 = new Planos("Basic","3 meses","R$ 210,00");
		Planos Planos2 = new Planos("Super","6 meses","R$ 360,00");
		Planos Planos3 = new Planos("Master","12 meses","R$ 660,00");
		
		Planos.add(Planos1);
		Planos.add(Planos2);
		Planos.add(Planos3);
		
					
		for (Planos P : Planos) {
			System.out.println("\nPlano: \n" + P);
		}
		
		System.out.println("\nAlunos matriculados: " + "\n" + DadosAlunos.nome + " - Plano: " + Planos2.nome + "\n" + DadosAlunos1.nome + " - Plano: " + Planos1.nome + "\n" + DadosAlunos2.nome + " - Plano: " + Planos2.nome + "\n" + DadosAlunos3.nome + " - Plano: " + Planos3.nome);
	
	
		System.out.println();
		
		System.out.println("Alunos Ativo: " + Alunos.size());
		System.out.println("Alunos não ativos: " + AlunosII.size());
		}

}
