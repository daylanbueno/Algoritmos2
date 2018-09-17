package br.com.alura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.modelo.Pessoa;

public class MenorIdadeTest {
	
	private MenorIdade menorIdade;
	
	private Pessoa [] pessoas = new Pessoa[5];
	
	@Before
	public  void  iniciaMenorIdade() {
		this.menorIdade = new  MenorIdade();
		cadastraPessoas();
		this.menorIdade.adicionaPessoas(pessoas);
	}

	private void cadastraPessoas() {
		this.pessoas[0] =new Pessoa("Dailan",25);
		this.pessoas[1] =new Pessoa("Amanda",23);
		this.pessoas[2] =new Pessoa("Dilan",1);
		this.pessoas[3] =new Pessoa("Raimundo",65);
	}
	
	@Test(expected=NullPointerException.class)
	public void deveRetornaNullPointerException() {
		menorIdade.adicionaPessoas(null);				
	}
	
	
	@Test
	public void buscaMenorTest() {
		Pessoa pessoaMaisNova = menorIdade.getPessoaMaisNova();
		assertEquals(1, pessoaMaisNova.getIdade());
	}
	

}
