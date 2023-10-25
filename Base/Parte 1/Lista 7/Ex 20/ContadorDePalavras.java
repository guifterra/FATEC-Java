import java.util.Scanner;

public class ContadorDePalavras {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDePalavras = 0;
		int validacaoTamanho;
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		frase = " " + frase;
		
		for(int i = 0; i <= (frase.length() - 1); i++){
			
			validacaoTamanho = i + 1;
			
			if((frase.charAt(i)) == ' '){
				if(validacaoTamanho <= (frase.length() - 1)){
					if((frase.charAt(validacaoTamanho)) != ' ')
						quantidadeDePalavras++;
				}
			}
			
		}
		
		System.out.print("\n A quantidade de palavras na frase e: " + quantidadeDePalavras);
	}
}
