public class AlfabetoMinusculoNaStr {
	
	public static void main(String[] args){
		
		String alfabeto = "";
		int aux;
		
		for(aux = 97; aux <= (97 + 25); aux++)
			alfabeto += (char)aux;
			
		System.out.print("\n Alfabeto: " + alfabeto);
		
	}
}
