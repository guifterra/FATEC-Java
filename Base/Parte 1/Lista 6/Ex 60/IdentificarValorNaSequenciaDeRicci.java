import java.util.Scanner;

public class IdentificarValorNaSequenciaDeRicci {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com o primeiro termo: ");
		int numero1 = leia.nextInt();
		
		System.out.print("\n Entre com o segundo  termo: ");
		int numero2 = leia.nextInt();
		
		System.out.print("\n Entre com um numero: ");
		int numero = leia.nextInt();
		
		int a, b, c, i;
		boolean resultado = false;
		
		a = numero1;
		b = numero2;
		
		do{	
			c = a + b;
			b = a;
			a = c;
			
			if (c == numero)
				resultado = true;
				
		}while(c <= numero);
		
		if (resultado){
			
			System.out.print("\n\n O numero " + numero + " pertence a sequencia de Ricci para " + numero1 + " e " + numero2);
			
		} else {
			
			System.out.print("\n\n O numero " + numero + " NAO pertence a sequencia de Ricci para " + numero1 + " e " + numero2);
		}
	}
}
