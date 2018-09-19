package br.com.alura;

import br.com.alura.modelo.Pessoa;
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

	public Produto[] ordenaProdutos(Produto[] produtos) {
		for (int atual= 0; atual < produtos.length; atual ++) {
			int indexMaisBarato = buscaPosicaoProdutoMenorPreco(produtos, atual, produtos.length - 1);
			Produto produtoMaisBarto = produtos[indexMaisBarato];
			Produto produtAtual = produtos[atual];
			produtos[indexMaisBarato] = produtAtual;
			produtos[atual] = produtoMaisBarto;
		}
		return produtos;
	}

}
