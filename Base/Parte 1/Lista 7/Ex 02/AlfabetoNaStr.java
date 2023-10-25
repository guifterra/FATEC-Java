public class AlfabetoNaStr {
	
	public static void main(String[] args){
		
		String alfabeto = "";
		int aux;
		
		for(aux = 65; aux <= 90; aux++)
			alfabeto += (char)aux;
			
		System.out.print("\n Alfabeto: " + alfabeto);
		
	}
}
