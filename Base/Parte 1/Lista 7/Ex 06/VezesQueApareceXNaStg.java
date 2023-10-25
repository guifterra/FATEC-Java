import java.util.Scanner;

public class VezesQueApareceXNaStg {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		System.out.print("\n Entre com a letra: ");
		String letra = leia.nextLine().toUpperCase();
		
		char x = letra.charAt(0);
		
		
		int quantidadeDeAs = 0;
		
		for(int i = 0; i < (frase.length()); i++){
			
			if((frase.toUpperCase().charAt(i) == x))
				quantidadeDeAs++;
			
		}
		
		System.out.printf("\n A quantidade de '%s's encontrados foi: %d", x, quantidadeDeAs);
		
		
	}
}
