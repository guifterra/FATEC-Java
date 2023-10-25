import java.util.Scanner;

public class Ex27 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		while(true){
		
			System.out.print("\n Entre com o texto 1: ");
			String texto1 = leia.nextLine();
			
			System.out.print("\n Entre com o texto 2: ");
			String texto2 = leia.nextLine();
			
			if((texto1.length()) == (texto2.length())){
				
				String concatenados = "";
				
				for(int aux = 0; aux < texto1.length(); aux++){
					
					concatenados += texto1.charAt(aux);
					concatenados += texto2.charAt(aux);
					
				}
				
				System.out.print("\n\n Saida: " + concatenados);
				
				break;
				
			} else {
				
				System.out.print("\n Erro ! Entradas de tamanhos diferentes. \n\n");
				
			}
		}
	}
}
