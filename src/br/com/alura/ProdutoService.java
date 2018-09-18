package br.com.alura;

import br.com.alura.modelo.Produto;

public class ProdutoService {
	
	public Produto getProdutoMaisBarato(Produto[]  produtos) {
		int indexMenorValor = 0;
		for (int atual =0; atual < produtos.length; atual ++) {
			if (produtos[atual].getPreco() < produtos[indexMenorValor].getPreco()) {
				indexMenorValor = atual;
			}
		}
		return produtos[indexMenorValor];
	}
	
	public Produto getProdutoMaisCaro(Produto[] produtos) {
		int indexMaisCaro = 0;
		for (int atual = 0;  atual < produtos.length; atual++) {
			if (produtos[atual].getPreco() > produtos[indexMaisCaro].getPreco()) {
				indexMaisCaro = atual;
			}
		}
		return produtos[indexMaisCaro];
	}
}
