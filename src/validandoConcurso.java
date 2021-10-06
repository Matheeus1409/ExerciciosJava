import java.util.Scanner;

public class validandoConcurso {

	static final Integer NOTA_GERAL = 150;
	static final Integer NOTA_MINIMA = 60;
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Veja se passou no concurso");
		System.out.println(" ");
		
		System.out.print("Digite aqui a sua nota em Português: ");
		Integer notaPortugues = leitura.nextInt();
		
		System.out.print("Agora digite a sua nota em Matematica: ");
		Integer notaMatematica = leitura.nextInt();
		
		Boolean validaNota = notaMatematica + notaPortugues >= NOTA_GERAL;
		Boolean notaMinimaPortugues = notaPortugues >= NOTA_MINIMA;
		Boolean notaMinimaMatematica = notaMatematica >= NOTA_MINIMA;
		Boolean conferencia = validaNota && notaMinimaMatematica && notaMinimaPortugues;
		
		if (conferencia) {
			System.out.println("Parabéns, vc está aprovado!");
		} else {
			System.out.println("Infelizmente vc não foi aprovado!");
		}
	
		leitura.close();
	}
}
