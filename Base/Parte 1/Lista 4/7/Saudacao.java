import java.util.Random;
import java.util.Scanner;

public class Saudacao {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// mensagem
		System.out.print("\n 1- Gerar valor randomico para hora \n 2- Inserir valor de hora Manualmente");
		
		// entrada de decisao
		System.out.print("\n\n Inserir escolha: ");
		int escolha = leia.nextInt();
		
		// validacao de escolha
		if ((escolha == 1) || (escolha == 2)){
		
			int hora;
			// Randomico ou Manual?
			if (escolha == 1){
				
				// Randomico
				Random gerador = new Random();
				hora = gerador.nextInt(23);
				
				System.out.print("\n Horario: " + hora + "h \n");
				if ((hora >= 0) && (hora <= 6)){
					
					System.out.print(" Zzzzzzz");
					
					} else {
					
					if ((hora >= 7) && (hora <= 11)){
					
						System.out.print(" Bom dia!");
					
					} else {
						
						if ((hora >= 12) && (hora <= 17)){
						
							System.out.print(" Boa tarde");
						
							} else {
							
							System.out.print(" Boa noite");
						}
					}
				}
				
				} else {
				
				// Manual
				System.out.print("\n Entre com o horario (0 a 23): ");
				hora = leia.nextInt();
				
				// Validacao
				if ((hora >= 0) && (hora <= 23)){
				
					System.out.print("\n Horario: " + hora + "h \n");
					if ((hora >= 0) && (hora <= 6)){
						
						System.out.print(" Zzzzzzz");
						
						} else {
						
						if ((hora >= 7) && (hora <= 11)){
						
							System.out.print(" Bom dia!");
						
						} else {
							
							if ((hora >= 12) && (hora <= 17)){
							
								System.out.print(" Boa tarde");
							
								} else {
								
								System.out.print(" Boa noite");
							}
						}
					}
				
					} else {
					
					System.out.print("\n VALOR DE HORARIO INVALIDO !");
				
				}
			}
		
			} else {
				
			System.out.print("\n VALOR DE ESCOLHA INVALIDO! ");
				
		}
		
	}
}
