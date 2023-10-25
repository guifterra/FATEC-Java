import java.util.Scanner;

public class SequenciaDeRicciDeXTermos {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com o primeiro termo: ");
		int numero1 = leia.nextInt();
		
		System.out.print("\n Entre com o segundo  termo: ");
		int numero2 = leia.nextInt();
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeTermos = leia.nextInt();
		
		int a, b, c, i;
		
		a = numero1;
		b = numero2;
		
		System.out.print("\n\n - - -> Sequencia: \n\n");
		
		System.out.print(" " + a);
		
		for (i = 2; i <= quantidadeTermos; i++){
			
			c = a + b;
			b = a;
			a = c;
			
			System.out.print(" " + c);
		}
	}
}
