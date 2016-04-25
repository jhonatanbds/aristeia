package Mochila;

import item.Pocao;
import java.util.ArrayList;
import Exception.ExceptionNull;

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
			pocoes.add(pocao);
		}
	}
	
	public void adicionaArma(Arma arma) throws Exception{
		if (armasIsFull()){
			throw new Exception("Limite de Armas atingido!");
		}else{
			armas.add(arma);
		}
	}
	
	public ArrayList<Arma> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}
	
	public boolean pocoesIsFull(){
		return pocoes.size() == QTDPOCOES;
	}
	
	public boolean armasIsFull(){
		return armas.size() == QTDARMAS;
	}
	
	public Pocao procuraPocao(String nomePocao) throws ExceptionNull{
		for(Pocao p: pocoes){
			if(p.getNome().equalsIgnoreCase(nomePocao)){
				return p;
			}
		}
		throw new ExceptionNull();
	}
	
	public Arma procuraArma(String nomeArma){
		for(Arma a: armas){
			if(a.getNome().equalsIgnoreCase(nomeArma)){
				return a;
			}
		}
		return null;
	}
}
