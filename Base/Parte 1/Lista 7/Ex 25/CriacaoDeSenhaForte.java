import java.util.Scanner;

public class CriacaoDeSenhaForte {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeMaiusculos;
		int quantidadeMinusculos;
		int quantidadeEspeciais;
		int quantidadeNumeros;
		
		while(true){
			
			System.out.print("\n Entre com a senha: ");
			String senha = leia.nextLine();
			
			quantidadeMaiusculos = 0;
			quantidadeMinusculos = 0;
			quantidadeNumeros = 0;
			quantidadeEspeciais  = 0;
			
			for(int i = 0; i <= (senha.length() - 1); i++){
				
				if(((senha.charAt(i)) >= 'A') && ((senha.charAt(i) <= 'Z'))){
				
					quantidadeMaiusculos++;
				
				} else if(((senha.charAt(i)) >= 'a') && ((senha.charAt(i) <= 'z'))){
				
					quantidadeMinusculos++;
				
				} else if(((senha.charAt(i)) >= '0') && ((senha.charAt(i) <= '9'))){
					
					quantidadeNumeros++;
					
				} else {
				
					quantidadeEspeciais++;
				
				}
				
			}
			
			System.out.print("\n -> REGRAS: \n");
			System.out.print("\n Tamanha 10: " + (senha.length()) + ((((senha.length()) >= 10))? " (ok)": " (x)"));
			System.out.print("\n Letras  03: " + (quantidadeMaiusculos + quantidadeMinusculos) + ((((quantidadeMaiusculos + quantidadeMinusculos) >= 3))? " (ok)": " (x)"));
			System.out.print("\n Numeros 03: " + quantidadeNumeros + (((quantidadeNumeros >= 3))? " (ok)": " (x)"));
			System.out.print("\n Simbolo 02: " + quantidadeEspeciais + (((quantidadeEspeciais >= 2))? " (ok)": " (x)"));
			
			
			if((quantidadeMaiusculos != 0) && (quantidadeMinusculos != 0) && ((quantidadeMaiusculos + quantidadeMinusculos) >= 3) && (quantidadeNumeros >= 3) && (quantidadeEspeciais >= 2) && ((senha.length()) >= 10)){
				break;
			} else {
				
				System.out.print("\n\n Senha reporvada! Tente novamente! \n");
				
			}
		}
		
		System.out.print("\n\n Senha Aprovada! Parabens! \n");
	}
}
