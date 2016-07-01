import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		//CRIA classe Scanner para poder obter entrada do usuário
		Scanner input = new Scanner(System.in);
		
		//CRIA objeto myGradeBook da classe GradeBook
		//FORMATAÇÃO: NomeClasse nomeObjeto = new ChamadaClasse();
		GradeBook myGradeBook = new GradeBook("null"); 
		
		//EXIBE valor inicial de nomeCurso
		System.out.printf("Nome inicial do curso e: %s\nValor inicial de String e sempre null\n\n",myGradeBook.getNomeCurso());		
		
		//ENTRADA do nome do curso
		System.out.println("Digite nome do curso:");
		String nomeNovoCurso = input.nextLine(); //lê a linha de texto como uma String
		myGradeBook.setNomeCurso(nomeNovoCurso); //modifica valor de nomeCurso
		System.out.println(); //gera uma linha em branco
		
		/*CHAMA método mostraMensagem da classe GradeBook
		 *Passa nomeCurso como argumento*/		
		myGradeBook.mostraMensagem(nomeNovoCurso);
		
		//USA CONSTRUTOR com novo objeto exeGradeBook
		GradeBook exeGradeBook = new GradeBook("CS01 Introducao aos Unicornios Magicos e suas Origens");
		
		//EXIBE valor de nomeCurso para objeto exeGradeBook
		System.out.printf("\nNome do novo objeto e: %s\n",exeGradeBook.getNomeCurso());
	}

}
