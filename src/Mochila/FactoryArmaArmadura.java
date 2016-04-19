package Mochila;

import Exception.ExceptionNegativo;
import Exception.ExceptionNomePersonagem;

public class FactoryArmaArmadura {

	
	public Arma criaArma(String nome, int dano) throws ExceptionNomePersonagem, ExceptionNegativo{
		return new Arma(nome, dano);
		
	}
	
	public Armadura criaArmadura(String nome, int block) throws ExceptionNomePersonagem, ExceptionNegativo{
		return new Armadura(nome, block);
	}
}
