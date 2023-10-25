public class TabelaASCHII {
	
	public static void main(String[] args){
		
		int elemento;
		
		System.out.print("\n - - -> TABELA ASCHII: \n\n");
		
		for(elemento = 0; elemento <= 255; elemento++){
			System.out.print(" Elemento " + elemento + " : " + (char)elemento + "\n");
		}
	}
}
