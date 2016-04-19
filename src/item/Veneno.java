package item;

public class Veneno extends Pocao {

	public Veneno(String nome, int qtdTurno, double efeito) {
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
