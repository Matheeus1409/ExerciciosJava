import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println(" ");
		
		System.out.print("Digite um valor: ");
		Integer valor1 = leitura.nextInt();
		
		System.out.print("Digite a operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operacao = leitura.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		Integer valor2 = leitura.nextInt();

		Integer resultado = null;
		
		
		if (operacao.equals(1)) {
			resultado = valor1+valor2;
			}
		if (operacao.equals(2)) {
			resultado = valor1-valor2;
		}
		if (operacao.equals(3)) {
			resultado = valor1*valor2;
		}
		if (operacao.equals(4)) {
			resultado = valor1/valor2;
		}
		
		System.out.println(" ");
		System.out.println("Resultado: " + resultado);
	
		leitura.close();
	}

}
