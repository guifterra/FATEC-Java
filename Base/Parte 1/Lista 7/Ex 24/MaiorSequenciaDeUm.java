import java.util.Scanner;

public class MaiorSequenciaDeUm {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a sequencia: ");
		String sequencia = leia.nextLine();
		
		int maiorQuantidadeDeUnsSeguidos = 0, aux = 0;
		
		for(int i = 0; i <= (sequencia.length() - 1); i++){
			
			if((sequencia.charAt(i)) == '1'){
			
				aux++;
			
			}else{
			
				aux = 0;
			
			}
			
			if(aux > maiorQuantidadeDeUnsSeguidos)
				maiorQuantidadeDeUnsSeguidos = aux;
			
		}
		
		System.out.print("\n A maior sequencia de 1's encontrada foi de: " + maiorQuantidadeDeUnsSeguidos + ((maiorQuantidadeDeUnsSeguidos == 1)? " Vez": " Vezes"));
		
	}
}
