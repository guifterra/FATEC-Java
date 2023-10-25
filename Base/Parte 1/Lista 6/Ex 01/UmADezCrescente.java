public class UmADezCrescente {
	
	public static void main(String[] args){
		
		int[] vetor = new int[10];
		int aux;
		
		for(aux = 0; aux <=9 ; aux++){
			
			vetor[aux] = aux + 1;
			
		}
		
		for(aux = 0; aux <=9 ; aux++){
			
			System.out.print("\n " + vetor[aux]);
			
		}
		
	}
}
