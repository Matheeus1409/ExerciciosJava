import java.util.Scanner;

public class leituraNotaAluno {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Sistema de Notas do Aluno");
		System.out.println(" ");
		System.out.print("Digite sua nota de Lingua Portuguesa: ");
		Integer notaPortugues = leitura.nextInt();
		
		System.out.print("Agora digite sua nota de matematica: ");
		Integer notaMatematica = leitura.nextInt();
		
		Integer total = notaMatematica+notaPortugues;
		
		Boolean revisao = total >= 70;
		
		System.out.println(" ");
		
		if (revisao) {
			System.out.println("Parabéns, vc está aprovado");
		} else {
			System.out.println("Infelizmente vc está reprovado");
		}
		
		
		
		leitura.close();
	}
}
