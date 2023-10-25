
package usapersonalidade;

import java.util.Scanner;

public class UsaPersonalidade {
	
	public static void main (String[] args) {
		
		
		Scanner leia = new Scanner ( System.in );
		
		int codigo = 4;
		
		Personalidade personalidade = selecionaPersonalidade ( codigo );
		
		System.out.println("O codigo da personalidade: " + codigo );
		System.out.println("Nome.: " + personalidade.nome  );
		System.out.println("Idade: " + personalidade.idade );
	}
	
	
	static Personalidade selecionaPersonalidade ( int codigo ) {
		
		// <tipo variável> <nome variável> = new <tipo variável>();
		   Personalidade          p        = new  Personalidade ();
		
		switch ( codigo ) {
			
			case 1:
				
				p.nome  = "Chucha";
				p.idade = 22;
				break; 
				
			case 2:
				
				p.nome  = "JC";
				p.idade = 33;
				break; 
				
			case 3:
				
				p.nome  = "Joseverson";
				p.idade = 72;
				break; 
				
		}
		
		return p;
	}
	

}

