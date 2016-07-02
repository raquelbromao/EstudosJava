import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		//CRIA objetos da classe Conta
		Conta conta1 = new Conta(55.00);
		Conta conta2 = new Conta(7.50);
		
		//EXIBE o valor dos objetos
		System.out.printf("Saldo da conta 1: R$%.2f\n",conta1.getBalanco());
		System.out.printf("Saldo da conta 2: R$%.2f\n\n",conta2.getBalanco());
		
		//ENTRADA de um depósito na conta 1
		Scanner input = new Scanner(System.in);
		double depositoValor;
		
		System.out.print("Insira o valor do deposito 1:");
		depositoValor = input.nextDouble();
		
		conta1.credito(depositoValor);
		
		System.out.printf("Saldo novo da conta 1: R$%.2f\n\n", conta1.getBalanco());
		
		//ENTRADA de um depósito na conta 2
		System.out.print("Insira o valor do deposito 2:");
		depositoValor = input.nextDouble();
		
		conta2.credito(depositoValor);
		
		System.out.printf("Saldo novo da conta 2: R$%.2f", conta2.getBalanco());
		
		input.close();
	}

}
