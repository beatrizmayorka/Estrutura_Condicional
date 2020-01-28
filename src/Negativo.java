import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in); 
							
			// Scanner = tipo da variável 
			// sc = nome da variável 
			// new Scanner(System.in) = faz a entrada de dados, ou seja, é o teclado no modo console 
					
		System.out.println("Informe o número:"); // faz a mensagem entre aspas aparecer para o usuário
		int N = sc.nextInt();
				
			if (N < 0) {	// --- Se --- o número for menor do que 0
				System.out.println("NEGATIVO");
			}
			else {	// Senão
				System.out.println("NÃO NEGATIVO");
			}								
		
		sc.close(); 	// Encerra o recurso Scanner
	
	}
}	