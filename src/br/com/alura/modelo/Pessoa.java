package br.com.alura.modelo;

public class Pessoa {
	private int idade;
	private String nome;
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	@Override
	public String toString() {
		return "Nome "+ this.nome + " Idade" +this.idade;
	}

}
