package Mochila;

import java.util.ArrayList;

import item.*;

public class Mochila {
	
	private ArrayList<Pocao> pocoes;
	private ArrayList<Arma> armas;
	private static final int QTDPOCOES = 5;
	private static final int QTDARMAS = 5;
	
	public Mochila(){
		pocoes = new ArrayList<Pocao>();
		armas = new ArrayList<Arma>();
	}
	
	public ArrayList<Pocao> getPocoes() {
		return pocoes;
	}
	
	//ajeitar pra pocao ser instanciavele colocar o array como pocao mesmo
	public void adicionaPocao(Pocao pocao) throws Exception{
		if(pocoesIsFull()){
			throw new Exception("Limite de pocoes atingido");
		}else{
			if(pocao instanceof Aristeia){
				pocoes.add(new Aristeia(pocao.getNome(), pocao.getQtdTurno(), pocao.getEfeito()));
				
			}else if(pocao instanceof Regen){
				pocoes.add(new Regen(pocao.getNome(), pocao.getQtdTurno(), pocao.getEfeito()));
				
			}else if(pocao instanceof Veneno){
				pocoes.add(new Veneno(pocao.getNome(), pocao.getQtdTurno(), pocao.getEfeito()));
			}
			
		}
	}
	
	public HashSet<Arma> getArmas() {
		return armas;
	}

	public void setArmas(HashSet<Arma> armas) {
		this.armas = armas;
	}
	
	public boolean pocoesIsFull(){
		return pocoes.size() == QTDPOCOES;
	}
}
