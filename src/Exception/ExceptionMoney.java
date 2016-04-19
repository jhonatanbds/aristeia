/* 115110299 - ARTUR HERMOGENES DO REGO CARDOSO: LAB 06 - Turma 2 */
package Exception;

@SuppressWarnings("serial")
public class ExceptionMoney extends Exception{
	public ExceptionMoney(){
		super("Nao aceitamos cartao, so aceitamos dinheiro em especie aqui, forasteiro.");
	}

}
