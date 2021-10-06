import java.util.Scanner;

public class aposentadoria {
	
	static final Integer TEMPO_MINIMO_IDADE = 55;
	static final Integer TEMPO_MINIMO_CONTRIBUICAO = 25;
	public static void main(String[] args) {
		
		Scanner leitura =new Scanner(System.in);
		
		System.out.println("Controle de aposentadoria");
		System.out.println(" ");
		
		System.out.print("Digite aqui sua idade: ");
		Integer idade = leitura.nextInt();
		
		System.out.print("Agora digite o seu tempo de contribuição: ");
		Integer contribuicao = leitura.nextInt();
		
		Boolean idadeMinima = idade >= TEMPO_MINIMO_IDADE;
		Boolean contribuicaoMinima = contribuicao >= TEMPO_MINIMO_CONTRIBUICAO;
		Boolean podeAposentar = idadeMinima && contribuicaoMinima;
		
		if (podeAposentar) {
			System.out.println("Parabéns, o(a) senhor(a) já pode aposentar-se!");
		} else {
			System.out.println("Infelizmente o(a) senhor(a) ainda pode aposentar-se");
		}
		
		leitura.close();
	}

}
