package Mochila;

import Exception.ExceptionNegativo;
import Exception.ExceptionNomePersonagem;

public class Armadura {

	private String nome;
	private int block;
	
	public Armadura(String nome, int block) throws ExceptionNomePersonagem, ExceptionNegativo{
		setNome(nome);
		setBlock(block);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws ExceptionNomePersonagem {
		if(nome.trim().equalsIgnoreCase("") && nome.equalsIgnoreCase(null))
			throw new ExceptionNomePersonagem();
		this.nome = nome;
	}
	
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) throws ExceptionNegativo {
		if (block <= 0)
			throw new ExceptionNegativo();
		this.block = block;
	}
		
	
}
