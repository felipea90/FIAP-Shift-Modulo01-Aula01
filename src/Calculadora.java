import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double valor1;
		double valor2;
		
		double soma, multi, div, sub;
		
		int escolha;
		
		System.out.println("Digite o primeiro valor:");
		
		valor1 = leitor.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		sub = valor1 - valor2;
		div = valor1 / valor2;
		multi = valor1 * valor2;
		
		System.out.println("A Soma dos valores �: " + soma);
		
		System.out.println("A Subtra��o dos valores �: " + sub);
		
		System.out.println("A Divis�o dos valores �: " + div);
		
		System.out.println("A Multiplica��o dos valores �: " + multi);
		
		
		
		leitor.close();

	}

}
