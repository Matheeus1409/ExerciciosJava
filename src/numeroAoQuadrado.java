import java.util.Scanner;

public class numeroAoQuadrado {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Número ao Quadrado");
		System.out.print("Digite um número: ");
		Integer numero = leitura.nextInt();
		
		Integer resultado = numero*numero;
		
		System.out.println("O resultado do numero " + numero + " ao quadrado é " + resultado);
		
		leitura.close();
	}
}
