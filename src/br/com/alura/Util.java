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

}
