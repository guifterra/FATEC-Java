public class DezAUmDecrescente {
	
	public static void main(String[] args){
		
		int[] vetor = new int[10];
		int aux;
		
		for(aux = 9; aux >=0 ; aux--){
			
			vetor[aux] = 10 - aux;
			
		}
		
		for(aux = 0; aux <=9 ; aux++){
			
			System.out.print("\n " + vetor[aux]);
			
		}
		
	}
}
