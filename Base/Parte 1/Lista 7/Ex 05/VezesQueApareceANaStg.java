import java.util.Scanner;

public class VezesQueApareceANaStg {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		int quantidadeDeAs = 0;
		
		for(int i = 0; i < (frase.length()); i++){
			
			if((frase.charAt(i) == 'A') || (frase.charAt(i) == 'a'))
				quantidadeDeAs++;
			
		}
		
		System.out.print("\n A quantidade de 'A's encontrados foi: " + quantidadeDeAs);
		
		
	}
}
