import java.util.Scanner;

public class sistemaDeDescontos {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Sistema de descontos");
		System.out.println(" ");
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = leitura.nextDouble();
		
		System.out.print("Agora digite a quantidade que está levando: ");
		Integer quantidade = leitura.nextInt();
		
		Double total = quantidade*valorProduto;
		Boolean quantidadeMinima = quantidade <= 9;

		
		if (quantidadeMinima) {
			System.out.println("O total da compra é: " + total);
		} else {
			Double percentual = total* 10.0 / 100;
			Double valorFinal = total - percentual;
			System.out.println("O total da compra é: R$" + valorFinal);
		}
		
		leitura.close();
	}

}
