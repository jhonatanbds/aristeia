package item;

import Exception.ExceptionEfeito;
import Personagem.Guerreiro;

public abstract class Pocao {

	private String nome;
	private int qtdTurno;
	private double efeito;
	private boolean over;
	
	
//	tem que ver esse exception aqui...                       ↓        
	public Pocao(String nome, int qtdTurno, double efeito) throws ExceptionEfeito {
		setNome(nome);
		setQtdTurno(qtdTurno);
		setEfeito(efeito);
	}

	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdTurno() {
		return qtdTurno;
	}

	public void setQtdTurno(int qtdTurno) {
		this.qtdTurno = qtdTurno;
	}

	public double getEfeito() {
		return efeito;
	}

	public void viraTurno() {
		qtdTurno--;
	}

	public void setEfeito(double efeito) throws ExceptionEfeito {
		if (efeito < 50 && efeito > 100)
			throw new ExceptionEfeito();

		this.efeito = efeito;
	}

	public abstract boolean usa(Guerreiro g);

}
