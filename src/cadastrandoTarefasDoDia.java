import java.util.Scanner;

public class cadastrandoTarefasDoDia {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.print("Tarefa " + i + ": ");
			tarefas[i] = leitura.nextLine();
		}
		
		
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		leitura.close();
	}

}
