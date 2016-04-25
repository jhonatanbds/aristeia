package item;

import Exception.ExceptionEfeito;
import Personagem.Guerreiro;

public class Veneno extends Pocao {

	public Veneno(String nome, int qtdTurno, double efeito) throws ExceptionEfeito {
		super(nome, qtdTurno, efeito);
	}

	@Override
	public boolean usa(Guerreiro g) {
		if (getQtdTurno() == 0) {
			setOver(true);
			return true;
		}		
		g.addLife(-getEfeito()/Math.E);
		viraTurno();
		return true;
	}

}
