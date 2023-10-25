public class Media15A100 {
	
	public static void main(String[] args){
		
		int numero = 15, soma = 0, aux = 0;
		double media;
		
		while (numero <= 100){
			
			soma += numero;
			aux++;
			
			numero++;
		}
		
		System.out.print("\n A Media arit dos numeros entre 15 e 100 e: " + (soma / (double)aux));
		
		
	}
}
