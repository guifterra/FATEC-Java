import java.util.Scanner;

public class CalculoDeMediaDeDuasProvas {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
			boolean ok = true;
			boolean auxDeObrigacao;
			
			double nota1 = 0, nota2 = 0, media = 0;
			
			char decisao;
			
			while (ok){
				
				auxDeObrigacao = true;
				
				while (auxDeObrigacao) {
					
					System.out.print("\n Entre com a nota da P1: ");
					nota1 = leia.nextDouble();
					
					System.out.print("\n Entre com a nota da P2: ");
					nota2 = leia.nextDouble();
					
					if (((nota1 >= 0) && (nota1 <= 10)) && ((nota2 >= 0) && (nota2 <= 10))){
						
						auxDeObrigacao = false;
						
					} else {
					
						System.out.print ("\n ERRO: Um dos valores nao esta no intervalo 0 a 10! Tente novamente \n\n\n");
					
					}
					
				}
				
				media = (nota1 + nota2) / 2;
				System.out.print("\n Media do aluno: " + media + "\n\n");
				
				System.out.print(" Iniciar novo calculo? (S/N) R: ");
				decisao = leiaStr.next().charAt(0);
				
				if (decisao == 'S'){
				
					// NADA
				
				} else {
					
					ok = false;
				}
				
			}
		
	}
}
