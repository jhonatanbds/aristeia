package Personagem;

import Exception.ExceptionNomePersonagem;

public class Guerreiro {

	private String nome;
	private int dano;
	private double life;
	private boolean isEnveno;
	
	public Guerreiro(String nome, int dano, boolean isEnveno) throws ExceptionNomePersonagem{
		setNome(nome);
		setDano(dano);
		setEnveno(isEnveno);
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

	public boolean isEnveno() {
		return isEnveno;
	}
	public void setEnveno(boolean isEnveno) {
		this.isEnveno = isEnveno;
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
	
	
	
	
}
