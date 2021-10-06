import java.util.Scanner;

public class diasDaSemana {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Dias da semana");
		System.out.println(" ");
		
		System.out.print("Digite um numero de 1 à 7 para saber o dia da semana: ");
		Integer diaDaSemana = leitura.nextInt();
		
		String dia;
		
		switch (diaDaSemana) {
		case 1: dia = "domingo";
			break;
		case 2: dia = "segunda-feira";
			break;
		case 3: dia = "terça-feira";
			break;
		case 4: dia = "quarta-feira";
			break;
		case 5: dia = "quinta-feira";
			break;
		case 6: dia = "sexta-feira";
			break;
		case 7: dia = "sábado";
			break;
		default: dia ="Inválido";
		}
		
		System.out.println("O numero refere-se a(ao) " + dia);

		leitura.close();
	}

}
