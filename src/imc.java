import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Cálculo de Indice de Massa Corporal");
		
		System.out.print("Digite seu peso (Kg): ");
		Double peso = leitura.nextDouble();
		
		System.out.print("Agora digite sua altura (Metros): ");
		Double altura = leitura.nextDouble();
		
		Double alturaAoQuadrado = altura*altura;
		Double indiceMassaCorporal = peso/alturaAoQuadrado;
		
		System.out.println("Seu IMC é: " + indiceMassaCorporal);
		
		
		leitura.close();
	}
}
