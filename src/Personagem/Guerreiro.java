package Personagem;

import Exception.ExceptionNomePersonagem;
import Mochila.Arma;
import Mochila.Mochila;

public class Guerreiro {

	private String nome;
	private int dano;
	private double life;
	private boolean isVeneno;
	private Arma armaEquipada;
	private Mochila mochila;

	public Guerreiro(String nome, int dano, boolean isVeneno) throws ExceptionNomePersonagem{
		setNome(nome);
		setDano(dano);
		setVeneno(isVeneno);
		mochila = new Mochila();
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
	public boolean setDano(int dano) {
		this.dano = dano;
		return true;
	}
	public boolean addDano(int dano) {
		return setDano(getDano() + dano);
	}

	public boolean isVeneno() {
		return isVeneno;
	}
	public void setVeneno(boolean isVeneno) {
		this.isVeneno = isVeneno;
	}
	
	public double getLife() {
		return life;
	}

	public boolean setLife(double life) {
		this.life = life;
		return true;
	}
	public boolean addLife(double life){
		return setLife(getLife() + life); 
	}
	
	public Arma getArmaEquipada() {
		return armaEquipada;
	}
	public void setArmaEquipada(Arma armaEquipada) {
		this.armaEquipada = armaEquipada;
	}
	
	public void usaPocao(String nomePocao){
		
	}
}
