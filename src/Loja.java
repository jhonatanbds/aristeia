import item.Pocao;

import java.util.ArrayList;

import Exception.ExceptionNomePersonagem;
import Mochila.Arma;
import Personagem.Guerreiro;


public class Loja {
	
	private ArrayList<Pocao> pocoes;
	private ArrayList<Arma> armas;
	private Guerreiro personagem;
	
	public Loja(){
		pocoes = new ArrayList<Pocao>();
		armas = new ArrayList<Arma>();
	}
	
//	Eh necessario definir os tipos do personagem: Guerreiro, Monstro, Arqueiro etc.. 
//	A gente podia ver alguma ficha daqueles RPG's de mesa pra ter uma ideia de tipos de personagens.
	
	public void criaPersonagem(String nomePersongem, int dano, boolean isVeneno) throws ExceptionNomePersonagem{
		personagem = new Guerreiro(nomePersongem, dano, isVeneno);
	}
	
	public void adicionaPocao(String nomePocao){
//		Pocao pocao = new 
	}
	
	// Getters and setters 
	
	public ArrayList<Pocao> getPocoes() {
		return pocoes;
	}
	
	public void setPocoes(ArrayList<Pocao> pocoes) {
		this.pocoes = pocoes;
	}
	
	public ArrayList<Arma> getArmas() {
		return armas;
	}
	
	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}
	
	public Guerreiro getPersonagem() {
		return personagem;
	}
	
	public void setPersonagem(Guerreiro personagem) {
		this.personagem = personagem;
	}
}
