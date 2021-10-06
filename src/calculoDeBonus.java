import java.util.Scanner;

public class calculoDeBonus {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Calculo de bonus do funcion�rio");
		System.out.println(" ");
		
		System.out.print("Digite a meta de faturamento: ");
		Double meta = leitura.nextDouble();
		
		System.out.print("Digite o faturamento: ");
		Double faturamento = leitura.nextDouble();
		
		System.out.print("Digite a m�dia salarial dos ultimos 12 meses: ");
		Double mediaSalarial = leitura.nextDouble();
		
		Double oitentaMeta = (meta * 80) /100;
		
		Boolean bateuMeta = faturamento >= meta;
		
		Boolean faturouOitenta = faturamento >= oitentaMeta;
		
		if (bateuMeta) {
			System.out.println("vc vai ganhar um bonus de 100%, ele ser� de: R$" + mediaSalarial);
		}
		else if (faturouOitenta) {
			Double oitentaDaMediaSalarial = (mediaSalarial * 80) / 100;
			System.out.println("Vc ir� ganahr um bonus de 80%, que ser� de: " + oitentaDaMediaSalarial);
		} else {
			System.out.println("Infelizmente esse ano vc n�o ter� bonus!");
		}
		
		leitura.close();
	}

}
