package br.com.alura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.modelo.Produto;

public class ProdutoServiceTest {

	private Produto[] produtos = new Produto[5];
	private ProdutoService produtoService;
	
	@Before
	public void iniciar() {
		produtos[0]  = new Produto("Lanborghini",100000);
		produtos[1]  = new Produto("Jipe",46000);
		produtos[2]  = new Produto("Brasilia",16000);
		produtos[3]  = new Produto("Smart",46000);
		produtos[4]  = new Produto("Fusca",17000);
	    produtoService = new ProdutoService();
		
	}
	
	@Test
	public void deveRetornaProdutoMaisBarato() {
		Produto carroMaisBarato = produtoService.getProdutoMaisBarato(produtos);
		assertEquals(16000, carroMaisBarato.getPreco(), 0 );
	}
	
	@Test
	public void deveTestaProdutoMaisCaro() {
		Produto carroMaisCaro = produtoService.getProdutoMaisCaro(produtos);
		assertEquals(100000, carroMaisCaro.getPreco(), 0 );
	}	
}
