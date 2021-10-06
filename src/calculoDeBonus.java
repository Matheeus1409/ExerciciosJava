import java.util.Scanner;

public class calculoDeBonus {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Calculo de bonus do funcionário");
		System.out.println(" ");
		
		System.out.print("Digite a meta de faturamento: ");
		Double meta = leitura.nextDouble();
		
		System.out.print("Digite o faturamento: ");
		Double faturamento = leitura.nextDouble();
		
		System.out.print("Digite a média salarial dos ultimos 12 meses: ");
		Double mediaSalarial = leitura.nextDouble();
		
		Double oitentaMeta = (meta * 80) /100;
		
		Boolean bateuMeta = faturamento >= meta;
		
		Boolean faturouOitenta = faturamento >= oitentaMeta;
		
		if (bateuMeta) {
			System.out.println("vc vai ganhar um bonus de 100%, ele será de: R$" + mediaSalarial);
		}
		else if (faturouOitenta) {
			Double oitentaDaMediaSalarial = (mediaSalarial * 80) / 100;
			System.out.println("Vc irá ganahr um bonus de 80%, que será de: " + oitentaDaMediaSalarial);
		} else {
			System.out.println("Infelizmente esse ano vc não terá bonus!");
		}
		
		leitura.close();
	}

}
