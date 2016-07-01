import javax.swing.JOptionPane;

//Pacote javax.swing possui muitas classes que auxiliam na cria��o de interfaces gr�ficas

/**
 * @author Romao
 * @date 30/06/16
 * @version 1
 */

public class Dialogo {
	
	public static void main(String args[]) {
		// EXIBE di�logo com mensagem
		// Primeiro argumento: posi��o da caixa na tela, null centraliza
		// Segundo argumento: mensagem em si
		JOptionPane.showMessageDialog(null, "Welcome \nTo Java");

		// EXIBE caixa de di�logo com inser��o de entrada pelo usu�rio
		String noome = JOptionPane.showInputDialog("Qual seu noome?");

		// FORMATA a string adicionando o noome do usu�rio
		String mensagem = String.format("Bem-vindo, %s, a Programacao Java", noome);

		// EXIBE a mensagem com o noome do usu�rio
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
