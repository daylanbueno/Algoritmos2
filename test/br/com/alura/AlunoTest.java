package br.com.alura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AlunoTest {
	
	private Aluno [] alunosAndre = new Aluno[4];
	private Aluno [] alunosEduardo = new Aluno[6];
	private Aluno [] alunos = new Aluno[10];

	@Before
	public void carregaAlunosJaOrdenado() {
		carregaAlunosEduardo();
		carregarAlunosAndre();
		carregaAlunos();
	}

	private void carregaAlunos() {
		alunos[0] = new Aluno("Dailan",4.0);
		alunos[1] = new Aluno("Amanda",5.0);
		alunos[2] = new Aluno("Clarice",7.0);
		alunos[3] = new Aluno("Darlan",9.0);
		alunos[4] = new Aluno("Detinei",1.0);
		alunos[5] = new Aluno("Edivan",2.0);
		alunos[6] = new Aluno("Erisvan",4.0);
		alunos[7] = new Aluno("Ivan",6.0);
		alunos[8] = new Aluno("Ivonice",9.9);
		alunos[9] = new Aluno("Ivonice",10.0);
	}

	public void carregarAlunosAndre() {
		 alunosAndre[0] = new Aluno("Dailan",4.0);
		 alunosAndre[1] = new Aluno("Amanda",5.0);
		 alunosAndre[2] = new Aluno("Clarice",7.0);
		 alunosAndre[3] = new Aluno("Darlan",9.0);
		 System.out.println("Carrgou lista Andre");
	}
	
	public void carregaAlunosEduardo() {
		alunosEduardo[0] = new Aluno("Detinei",1.0);
		alunosEduardo[1] = new Aluno("Edivan",2.0);
		alunosEduardo[2] = new Aluno("Erisvan",4.0);
		alunosEduardo[3] = new Aluno("Ivan",6.0);
		alunosEduardo[4] = new Aluno("Ivonice",9.9);
		alunosEduardo[5] = new Aluno("Ivonice",10.0);
		System.out.println("Carrgou lista Eduardo");
	}

	@Test
	public void deveTestarMergeListaTurma() {
		Aluno[] alunosOrdenados = Util.getAlunosOrdenados(alunosAndre,alunosEduardo);
		assertEquals(alunosOrdenados[0].getNota(), 1.0,0);
		assertEquals(alunosOrdenados[1].getNota(), 2.0,0);
		assertEquals(alunosOrdenados[2].getNota(), 4.0,0);
		assertEquals(alunosOrdenados[3].getNota(), 4.0,0);
		assertEquals(alunosOrdenados[4].getNota(), 5.0,0);
		assertEquals(alunosOrdenados[5].getNota(), 6.0,0);
		assertEquals(alunosOrdenados[6].getNota(), 7.0,0);
		assertEquals(alunosOrdenados[7].getNota(), 9.0,0);
		assertEquals(alunosOrdenados[8].getNota(), 9.9,0);
		assertEquals(alunosOrdenados[9].getNota(), 10.0,0);
	}

	@Test
	public void deveTestarMergeTurmaMesmoArray() {
		Aluno[] alunosOrdenados = Util.getAlunosOrdenados(alunos, 0, alunosAndre.length, alunos.length);
		assertEquals(alunosOrdenados[0].getNota(), 1.0,0);
		assertEquals(alunosOrdenados[1].getNota(), 2.0,0);
		assertEquals(alunosOrdenados[2].getNota(), 4.0,0);
		assertEquals(alunosOrdenados[3].getNota(), 4.0,0);
		assertEquals(alunosOrdenados[4].getNota(), 5.0,0);
		assertEquals(alunosOrdenados[5].getNota(), 6.0,0);
		assertEquals(alunosOrdenados[6].getNota(), 7.0,0);
		assertEquals(alunosOrdenados[7].getNota(), 9.0,0);
		assertEquals(alunosOrdenados[8].getNota(), 9.9,0);
		assertEquals(alunosOrdenados[9].getNota(), 10.0,0);
	}

}
