package Mochila;

import Exception.ExceptionNegativo;
import Exception.ExceptionNomePersonagem;

public class Arma {

	private String nome;
	private int dano;
	
	public Arma(String nome, int dano) throws ExceptionNomePersonagem, ExceptionNegativo{
		setNome(nome);
		setDano(dano);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws ExceptionNomePersonagem {
		if(nome.trim().equalsIgnoreCase("") && nome.equalsIgnoreCase(null))
			throw new ExceptionNomePersonagem();
		this.nome = nome;
	}

	
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) throws ExceptionNegativo {
		if (dano <= 0)
			throw new ExceptionNegativo();
		this.dano = dano;
	}
	
}
