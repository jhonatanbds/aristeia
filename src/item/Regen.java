package item;

public class Regen extends Pocao {

	public Regen(String nome, int qtdTurno, double efeito) {
		super(nome, qtdTurno, efeito);
	}
	
	public boolean usa(Guerreiro g) {
		if (getQtdTurno() == 0) {
			setOver(true);
			return true;
		}		
		g.addLife(getEfeito()/Math.PI/2);
		viraTurno();
		return true;
	}

}
