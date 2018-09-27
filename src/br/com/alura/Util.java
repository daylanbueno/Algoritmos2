package br.com.alura;

public class Util {

	public static Aluno[] getAlunosOrdenados(Aluno[] alunosAndre, Aluno[] alunosEduardo) {
		Aluno[] rank = junta(alunosAndre,alunosEduardo);
		for (Aluno aluno: rank) {
			System.out.println(aluno);
		}
		return rank;
	}
	
	public static Aluno[] getAlunosOrdenados(Aluno[] alunos, int inicio, int miolo, int termino) {
		Aluno[] rank = junta(alunos,inicio, miolo, termino);
		for (Aluno aluno: rank) {
			System.out.println(aluno);
		}
		return rank;
	}
     
	private static Aluno[] junta(Aluno[] alunos, int inicio, int miolo, int termino) {
		Aluno[] resultado = new Aluno[alunos.length];
		
		int indexAtual1 = inicio;
		int indexAtual2 = miolo;
		int indexAtual = 0;
		
		while (indexAtual1 < miolo && indexAtual2 < termino) {
			
			Aluno aluno1 = alunos[indexAtual1];
			Aluno aluno2 = alunos[indexAtual2];
			
			if (aluno1.getNota() < aluno2.getNota()) {
				resultado[indexAtual] = aluno1;
				indexAtual1 ++;
			} else {
				resultado[indexAtual] = aluno2;
				indexAtual2++;
			}
			indexAtual++;
		}
		
		while (indexAtual1 < miolo) {
			resultado[indexAtual] = alunos[indexAtual1];
			indexAtual1++;
			indexAtual++;
		}
	
		while (indexAtual2 < termino) {
			resultado[indexAtual] = alunos[indexAtual2];
			indexAtual2++;
			indexAtual++;
		}
		return resultado;
	}
	
	private static Aluno[] junta(Aluno[] listaAlunos1, Aluno[] listaAlunos2) {
		int tamanho = listaAlunos1.length + listaAlunos2.length;
		Aluno[] resultado = new Aluno[tamanho];
		
		int indexAtual1 = 0;
		int indexAtual2 = 0;
		int atual = 0;
		
		while (indexAtual1 < listaAlunos1.length && indexAtual2 < listaAlunos2.length) {
			Aluno aluno1 = listaAlunos1[indexAtual1];
			Aluno aluno2 = listaAlunos2[indexAtual2];
			if (aluno1.getNota() < aluno2.getNota()) {
				resultado[atual] = aluno1;
				indexAtual1++;
			} else {
				resultado[atual] = aluno2;
				indexAtual2++;
			}
			atual++;
		}
		
		while (indexAtual1 < listaAlunos1.length) {
			resultado[atual] = listaAlunos1[indexAtual1];
			atual ++;
			indexAtual1++;
		}
		
		while (indexAtual2 < listaAlunos2.length) {
			resultado[atual] = listaAlunos2[indexAtual2];
			indexAtual2++;
			atual++;
		}
		return resultado;
	}

}
