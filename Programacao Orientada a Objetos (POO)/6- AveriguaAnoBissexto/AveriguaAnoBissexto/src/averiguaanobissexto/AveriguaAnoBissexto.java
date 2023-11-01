/*
 * Nome: Guilherme Fabiano Terra 
 * Averigua se Ano é Bissexto
 * 
 */
package averiguaanobissexto;

import java.util.Scanner;

public class AveriguaAnoBissexto {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        Ano ano = new Ano();
        
        int opcao = 1;
        
        do{
            
            System.out.print("\n\n = = = MENU = = = \n");
            System.out.print("\n 1) Informar ano ");
            System.out.print("\n 2) Mostrar  ano ");
            System.out.print("\n 3) Eh  bissexto? ");
            System.out.print("\n ---------------- ");
            System.out.print("\n 4) Sair ");
            System.out.print("\n ---------------- \n");
            
            System.out.print("\n >>> Opcao: ");
            opcao = leia.nextInt();
            
            switch (opcao){
                
                case 1:
                    System.out.print("\n\t Digite o ano: ");
                    ano.setAno( leia.nextInt() );
                    break;
                case 2:
                    System.out.print("\n\t Ano: " + ano.getAno() );
                    break;
                case 3:
                    System.out.print("\n\t Bissexto: " + ((ano.isBissexto())? "SIM" : "NAO"));
                    break;
                case 4:
                    System.out.print("\n Fim do programa . . .");
                    break;
                default:
                    System.out.print("\n Valor invalido ! ");
            }
            
        }while(opcao != 4);
    }
    
}
