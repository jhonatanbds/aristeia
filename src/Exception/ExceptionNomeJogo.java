/* 115110299 - ARTUR HERMOGENES DO REGO CARDOSO: LAB 06 - Turma 2 */
package Exception;

@SuppressWarnings("serial")
public class ExceptionNomeJogo extends Exception{
	public ExceptionNomeJogo(){
		super("Pra jogar tem que dizer o nome do jogo. \n"
				+ "A interface por interacao cerebral ainda esta em desenvolvimento");
	}
}
