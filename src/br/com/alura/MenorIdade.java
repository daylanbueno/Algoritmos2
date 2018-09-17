package br.com.alura;

import br.com.alura.modelo.Pessoa;

public class MenorIdade {
	
	
	private  Pessoa[] pessoas;
	
	public void adicionaPessoas(Pessoa[] novaLista) {
		if (novaLista == null) {
			throw new NullPointerException("Sua lista não pode serv null");
		}
		this.pessoas = novaLista;
	}
	
	public Pessoa getPessoaMaisNova() {
		int indexPessoaMaisVelha = 0;
		for (int indexAtual = indexPessoaMaisVelha; indexAtual < pessoas.length; indexAtual++) {
			if (pessoas[indexAtual]== null) {
				break;
			}
			if (pessoas[indexAtual].getIdade() < pessoas[indexPessoaMaisVelha].getIdade()) {
				indexPessoaMaisVelha = indexAtual;
			}
		}
		return pessoas[indexPessoaMaisVelha];
	}
	
}
