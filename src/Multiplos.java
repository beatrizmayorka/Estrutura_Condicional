import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);  
					
		System.out.println("Informe o primeiro número:"); 
		int A = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Informe o segundo numero");
		int B = sc.nextInt();
			
		System.out.println();
		
			if (A % B == 0 || B % A == 0) {	
				System.out.println("SÃO MÚLTIPLOS");
			}
			else {	
				System.out.println("NÃO SÃO MÚLTIPLOS");
			}								
		
		sc.close(); 	
	
	}
}	