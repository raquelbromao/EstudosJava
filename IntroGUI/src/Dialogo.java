import javax.swing.JOptionPane;

//Pacote javax.swing possui muitas classes que auxiliam na criação de interfaces gráficas

/**
 * @author Romao
 * @date 30/06/16
 * @version 1
 */

public class Dialogo {
	
	public static void main(String args[]) {
		// EXIBE diálogo com mensagem
		// Primeiro argumento: posição da caixa na tela, null centraliza
		// Segundo argumento: mensagem em si
		JOptionPane.showMessageDialog(null, "Welcome \nTo Java");

		// EXIBE caixa de diálogo com inserção de entrada pelo usuário
		String noome = JOptionPane.showInputDialog("Qual seu noome?");

		// FORMATA a string adicionando o noome do usuário
		String mensagem = String.format("Bem-vindo, %s, a Programacao Java", noome);

		// EXIBE a mensagem com o noome do usuário
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
