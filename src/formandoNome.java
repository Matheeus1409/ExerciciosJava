import java.util.Scanner;

public class formandoNome {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite seu primeiro nome: ");
		String nome = leitura.next();
		
		System.out.print("Digite agora o seu sobrenome: ");
		String sobrenome = leitura.next();
		
		System.out.println(" ");
		
		System.out.println("Seu nome completo é: " + nome +" " + sobrenome);
	
		leitura.close();
	}
}
