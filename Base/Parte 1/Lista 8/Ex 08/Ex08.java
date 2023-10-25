import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int F[] = new int[5];
		int soma = 0;
		
		System.out.print("\n - - -> LEITURA DO VETOR < - - - \n");
		for(int posicao = 0; posicao <= 4; posicao++){
			
			System.out.printf("\n\t Entre com o elemento %d : ", posicao);
			F[posicao] = leia.nextInt();
		}
		
		for(int posicao = 0; posicao <= 4; posicao++){
			
			if(((F[posicao]) % 2) != 0)
				soma += F[posicao];
		}
		
		if(soma != 0){
			
			System.out.print("\n A soma dos elementos impares do vetor e: " + soma);
			
		} else {
			
			System.out.print("\n O vetor nao possui elementos impares !");
			
		}
		
	}
}
