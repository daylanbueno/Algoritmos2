package br.com.alura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.alura.modelo.Produto;

public class UtilTest {
	
	private Produto[] produtos = new Produto[5];
	private Util util = new Util();
	@Before
	public void iniciar() {
		produtos[0]  = new Produto("Lanborghini",100000);
		produtos[1]  = new Produto("Jipe",46000);
		produtos[2]  = new Produto("Brasilia",16000);
		produtos[3]  = new Produto("Smart",46000);
		produtos[4]  = new Produto("Fusca",17000);
	
	}
	
	@Test
	public void deveTestaRetornoPosicaoProdutoMaisBarato() {
		int posicaoProdutoMaisBarato = util.buscaPosicaoProdutoMenorPreco(produtos, 0, produtos.length -1);
		assertEquals(2, posicaoProdutoMaisBarato);
	}
	
	@Test
	public void deveTestarSelectSortProduto() {
		Produto [] produtosOrder = util.ordenaProdutosSelectSort(produtos);
		validarOrdenacaoProduo(produtosOrder);
	}
	
	@Test
	public void deveTestarInsertSortProtuto() {
		Produto [] produtosOrder = util.ordenaProdutosSelectSort(produtos);
		validarOrdenacaoProduo(produtosOrder);
	}

	private void validarOrdenacaoProduo(Produto[] produto) {
		assertEquals(produto[0].getPreco(), 16000, 0);
		assertEquals(produto[1].getPreco(), 17000, 0);
		assertEquals(produto[2].getPreco(), 46000, 0);
		assertEquals(produto[3].getPreco(), 46000, 0);
		assertEquals(produto[4].getPreco(), 100000, 0);
	}
	
	
	
	
	
	
}
