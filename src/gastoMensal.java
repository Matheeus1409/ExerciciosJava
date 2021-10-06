import java.util.Scanner;

public class gastoMensal {
	
	public static void main(String[] args) {
		
		Scanner leitura= new Scanner (System.in);
		
		System.out.println("Controle de gastos");
		System.out.println(" ");
		
		System.out.println("Digite abaixo os valores gastos com:");
		
		Double total = 0.0;
		
		System.out.print("Luz: ");
		total += leitura.nextDouble();
		
		System.out.print("Água: ");
		total += leitura.nextDouble();
		
		System.out.print("Telefone: ");
		total += leitura.nextDouble();
		
		System.out.print("Escola: ");
		total += leitura.nextDouble();
		
		System.out.print("Cartão: ");
		total += leitura.nextDouble();

		System.out.print("Supermercado: ");
		total += leitura.nextDouble();

		System.out.println("Seu gasto mensal foi de: R$" + total);
		
		leitura.close();
	}

}
