import java.util.Scanner;

public class TestePalavraEmFrase {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine().toUpperCase();
		
		System.out.print("\n Entre com uma palavra: ");
		String palavra = leia.next().toUpperCase();
		
		int aux = 0, quantidadeAparecidasNaFrase = 0;
		for(int i = 0; i  <= (frase.length() - 1); i++){
			
			aux = 0;
			for(int j = i; j <= (i + palavra.length() - 1); j++){
				
				if((i + aux) <= (frase.length() - 1)){ // -----
					if((frase.charAt(i + aux)) == (palavra.charAt(aux))){
						
						aux++;
						
					} else {
						
						break;
						
					}
				} else {
					
					break;
					
				}
			}
			
			if(aux == (palavra.length()))
				quantidadeAparecidasNaFrase++;
		}
		
		System.out.print("\n\n -> Na frase - " + frase + " - a palavra - " + palavra + " - se repete:\n\n " + quantidadeAparecidasNaFrase + " vezes");
		
	}
}
