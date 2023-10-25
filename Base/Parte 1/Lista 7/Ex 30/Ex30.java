import java.util.Scanner;

public class Ex30 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		String zenit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String polar = "NOPQRSTUVWXYZABCDEFGHIJKLM";
		String frase1;
		String cripto = "";
		
		while(true){
			
			System.out.print("\n\n 1- Criptografar \n\n 2- Descriptografar \n\n 3- Sair \n\n\t Inserir sua escolha: ");
			int escolha = leia.nextInt();
			
			if(escolha == 3){
				
				System.out.print("\n\n Fim do programa . . . ");
				break;
				
			}
			
			if(escolha == 1){
				
				// Crioptografia
				System.out.print("\n\n Entre com a frase: ");
				frase1 = leiaStr.nextLine().toUpperCase();
				cripto = "";
				
				for(int i = 0; i < frase1.length(); i++){
					
					if(zenit.contains("" + (frase1.charAt(i)))){
						
						for(int j = 0; j < zenit.length(); j++){
							
							if((zenit.charAt(j)) == frase1.charAt(i)){
								
								cripto += polar.charAt(j);
								break;
								
							}
						}
					} else {
						
						cripto += frase1.charAt(i);
						
					}
				}
				
				System.out.print(" Frase cripto ....: " + cripto);
				
			} else if(escolha == 2){
				
				// Descriptografia
				System.out.print("\n\n Entre com a frase: ");
				frase1 = leiaStr.nextLine().toUpperCase();
				cripto = "";
				
				for(int i = 0; i < frase1.length(); i++){
					
					if(zenit.contains("" + (frase1.charAt(i)))){
						
						for(int j = 0; j < zenit.length(); j++){
							
							if((zenit.charAt(j)) == frase1.charAt(i)){
								
								cripto += polar.charAt(j);
								break;
								
							}
						}
					} else {
						
						cripto += frase1.charAt(i);
						
					}
				}
				
				System.out.print(" Frase despto ....: " + cripto);
				
				
				
			} else {
				
				System.out.print("\n\n Valor invalido ! Inserir nova entrada. \n");
				
			}
			
		}
	}
}
