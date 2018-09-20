package br.com.alura;

import br.com.alura.modelo.Produto;

public class Util {

	
	public int buscaPosicaoProdutoMenorPreco(Produto[] produtos, int pInicial, int pFim) {
		int indexMaisBarato = pInicial;
		for (int atual  = pInicial; atual <= pFim; atual ++) {
			if (produtos[atual].getPreco() < produtos[indexMaisBarato].getPreco()) {
				indexMaisBarato = atual;
			}
		}
		return indexMaisBarato;
	}

	public Produto[] ordenaProdutosSelectSort(Produto[] produtos) {
		for (int atual= 0; atual < produtos.length; atual ++) {
			int indexMaisBarato = buscaPosicaoProdutoMenorPreco(produtos, atual, produtos.length - 1);
			troca(produtos, atual, indexMaisBarato);
		}
		return produtos;
	}

	private void troca(Produto[] produtos, int primeiro, int segundo) {
		Produto primeiroProduto = produtos[primeiro];
		Produto segundoProduto = produtos[segundo];
		produtos[primeiro] = segundoProduto;
		produtos[segundo] = primeiroProduto;
	}
	
	public Produto[] ordenaProdutoInsertSort(Produto[] produtos) {
		for (int atual = 1; atual < produtos.length; atual ++) {
			int analise = atual;
			while (analise > 0 && produtos[atual].getPreco() < produtos[analise].getPreco()) {
				troca(produtos, atual, analise);
				analise --;
			}
		}
		return produtos;
	}

}
