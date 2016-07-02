/**
 * @author Romao
 * @date 01/07/16
 */

public class Parafrase {

	public static void main(String[] args) {
		//CRIAÇÃO das três listas (array da classe String) com palavras aleatórias
		String[] listaUmPalavras = {"Raquel", "Bruna", "Isabelle", "Patriciani", "Isadora", "Thiago", "Zzeks", "Abner", "Padu", "Angela", "Mariana", "Luiz"};
		String[] listaDoisPalavras = {"foi", "vai ser", "sera", "esta", "era", "se tornou", "se tornara", "esta sendo"};
		String[] listaTresPalavras = {"vadia", "louca", "maluca", "preguicosa", "faminta", "doida", "ativa", "sonolenta"};
		
		//DESCOBRE quantas palavras há em cada lista
		int tamUm = listaUmPalavras.length;
		int tamDois = listaDoisPalavras.length;
		int tamTres = listaTresPalavras.length;
		
		//GERA três números aleatórios
		//MÉTODO random gera um número entre 0 e quase 1, por isso a necessidade de multiplicá-lo pelo tamanho e depois forçá-lo a ser um tipo int
		int rand1 = (int) (Math.random() * tamUm);
		int rand2 = (int) (Math.random() * tamDois);
		int rand3 = (int) (Math.random() * tamTres);
		
		//COMBINA as listas e forma uma frase
		String frase = listaUmPalavras[rand1] + " " + listaDoisPalavras[rand2] + " " + listaTresPalavras[rand3];
		
		//IMPRIME a frase na tela
		System.out.println(frase);
	}

}
