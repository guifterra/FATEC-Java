import java.util.Scanner;

public class QuantidadeDeEspacosNaFrase {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		int qntDeEspacos = 0;
		
		for(int aux = 0; aux < frase.length(); aux++){
			
			if((frase.charAt(aux)) == ' ')
				qntDeEspacos++;
		}
		
		if(qntDeEspacos == 1){
			
			System.out.print("\n Sua frase possui: " + qntDeEspacos + " espaco");
			
		} else {
			
			System.out.print("\n Sua frase possui: " + qntDeEspacos + " espacos");
			
		}
	}
}
