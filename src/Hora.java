import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Informe a hora inicial do jogo:");
		int A = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Informe a hora final do jogo:");
		int B = sc.nextInt();

		System.out.println();
		
		int C;
			
			if (A < B) {
				C = B - A;
			}
			else {
				C = 24 - A + B;
			}
		
			if (C == 1) { 
				System.out.println("O JOGO DUROU " + C + " HORA.");
			}
			else {
				System.out.println("O JOGO DUROU " + C + " HORAS.");	
			}
		
		sc.close();
				
	}

}
