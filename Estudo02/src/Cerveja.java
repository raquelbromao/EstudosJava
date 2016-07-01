/**
 * @author Romao
 * @date 01/07/16
 */

public class Cerveja {

	public static void main(String[] args) {
		int numCerv = 99;
		String palavra = "garrafas";
		
		while (numCerv > 0) {
			if (numCerv == 1) {
				palavra = "garrafa"; 
			}
			
			System.out.println(numCerv + " " + palavra + " de cerveja na parede");
			System.out.println(numCerv + " " + palavra + " de cerveja.");
			System.out.println("Vire uma.");
			System.out.println("Passe as outras.");
			numCerv = numCerv - 1;
			
			
			if (numCerv > 0 && numCerv > 1) {
				System.out.println(numCerv + " " + palavra + " de cerveja na parede");
			} if (numCerv > 0 && numCerv == 1) {
				palavra = "garrafa";
				System.out.println(numCerv + " " + palavra + " de cerveja na parede");
			} if (numCerv == 0) {
				System.out.println("Mais nenhuma garrafa de cerveja na parede");
			}
		}
		
	}
}
