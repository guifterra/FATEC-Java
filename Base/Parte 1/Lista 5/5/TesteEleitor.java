import java.util.Scanner;

public class TesteEleitor {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir sua data de nascimento: ");
		int anoNascimento = leia.nextInt();
		
		System.out.print("\n\n Inserir data do ano atual: ");
		int anoAtual = leia.nextInt();
		
		if (anoNascimento == anoAtual){
			
			System.out.print("\n\n Vc eh recem nascido de alguns meses! ");
			
		} else {
		
			if (anoNascimento > anoAtual){
				
				System.out.print("\n\n DADOS INVALIDOS");
				
			} else {
				
				int idade = anoAtual - anoNascimento;
				if (idade >= 16) {
					
					System.out.print("\n\n Vc EH apto a votar");
					
				}else{
				
					System.out.print("\n\n Vc NAO EH apto a votar");
				
				}
			
			}
		
		}
		
	}
}
