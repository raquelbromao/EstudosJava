
public class GradeBook {

	//VARI�VEIS/ATRIBUTOS
	private String nomeCurso;
	
	//CONSTRUTOR
	public GradeBook(String nome) {
		//Inicializa atributo nomeCurso
		nomeCurso = nome; 
	}
	
	//SET E GET
	//SET -> modifica valor, retorna nada (void), recebe String
	//GET -> mostra valor, retorna String, recebe nada
	
	//SET nomeCurso
	public void setNomeCurso(String nome) {
		nomeCurso = nome;
	}
	
	//GET nomeCurso
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	//M�TODOS
	//VOID -> realiza uma tarefa, mas retorna nada ao seu m�todo de chamada
	public void mostraMensagem(String nomeCurso) { 
		System.out.printf("Bem Vindo ao Grade Book para\n%s!\n",nomeCurso);
	}

}
