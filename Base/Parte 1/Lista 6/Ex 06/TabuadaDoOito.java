public class TabuadaDoOito {
	
	public static void main(String[] args){
		
		final int numero = 8;
		int aux;
		
		System.out.println("\n ---> TABUADA DO " + numero + " : \n");
		for (aux = 1; aux <= 10; aux++){
			
			System.out.print("       " + numero + " x " + aux + " = " + (numero * aux));
			System.out.println();
		}
		
	}
}
