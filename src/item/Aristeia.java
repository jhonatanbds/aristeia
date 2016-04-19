package item;

import Personagem.Guerreiro;

public class Aristeia extends Pocao {

	public Aristeia(String nome, int qtdTurno, double efeito) {
		super(nome, qtdTurno, efeito);
	}
	
	public boolean usa(Guerreiro g) {
		if (getQtdTurno() == 0){
			setOver(true);
			g.setForca(g.getDanoReal() + g.getArma().getDano());
			return true;
		}
		g.addLife(-g.getLife()*0.3);
		g.addDano(g.getDano()*0.3);
		return true;
	}
	

}
