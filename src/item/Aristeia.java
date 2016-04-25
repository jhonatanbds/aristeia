package item;

import Exception.ExceptionEfeito;
import Personagem.Guerreiro;
	
public class Aristeia extends Pocao {
	
//	Como fazer a duracao do efeito dessa pocao? Vai ser temporal? Quantidade de turnos? Ate o fim da luta? enfim...
//	Pensar, inclusive, nas outras pocoes sobre a duracao do efeito.
	
	public Aristeia(String nome, int qtdTurno, double efeito) throws ExceptionEfeito {
		super(nome, qtdTurno, efeito);
	}
	
	public boolean usa(Guerreiro g) {
		if (getQtdTurno() == 0){
			setOver(true);
			g.setDano(g.getDano() + g.getArmaEquipada().getDano());
			return true;
		}
		g.addLife(-g.getLife()*0.3);
		g.addDano((int) (g.getDano()*0.3));
		return true;
	}
}