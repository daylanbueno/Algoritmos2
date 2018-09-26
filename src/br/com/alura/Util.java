package br.com.alura;

public class Util {

	public static Aluno[] getAlunosOrdenados(Aluno[] alunosAndre, Aluno[] alunosEduardo) {
		Aluno[] rank = junta(alunosAndre,alunosEduardo);
		for (Aluno aluno: rank) {
			System.out.println(aluno);
		}
		return rank;
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
