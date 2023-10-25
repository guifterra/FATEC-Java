import java.util.Scanner;

public class IdentificadorDeSobrenome {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com o nome completo: ");
		String nome = leia.nextLine();
		
		int posicaoTeoricaDoUltimoEspaco = 0;
		
		for(int i = 0; i <= (nome.length() - 1); i++){
		
			if((nome.charAt(i)) == ' ')
				posicaoTeoricaDoUltimoEspaco = i;
		}
		
		String sobrenome = nome.substring(posicaoTeoricaDoUltimoEspaco, (nome.length()));
		
		System.out.print("\n O sobrenome e: " + sobrenome);
		
		
		
	}
}
