import java.util.Scanner;

public class descontoEmFrete {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = leitura.nextDouble();
		System.out.println(" ");

		Boolean valorFinal = valorProduto <= 99.9;

		if (valorFinal) {
			Double valorAcrescimo = valorProduto + 15.0;
			System.out.println("valor final da compra: " + valorAcrescimo);
		}
		else {
			System.out.println("valor da compra: R$" + valorProduto);
		}
		leitura.close();
	}

}
