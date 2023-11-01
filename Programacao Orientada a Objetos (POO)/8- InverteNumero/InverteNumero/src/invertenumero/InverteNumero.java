/*
 * Nome: Guilherme Fabiano Terra
 * Inverte numeros inteiros
 *
 */
package invertenumero;

import java.util.Scanner;

public class InverteNumero {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in );
        
        Numero numero = new Numero();
        
        int opcao = 1;
        
        do{
            
            System.out.print("\n\n = = = MENU = = = \n");
            System.out.print("\n 1) Informar numero ");
            System.out.print("\n 2) Mostrar  numero ");
            System.out.print("\n 3) Inverter numero ");
            System.out.print("\n ---------------- ");
            System.out.print("\n 4) Sair ");
            System.out.print("\n ---------------- \n");
            
            System.out.print("\n >>> Opcao: ");
            opcao = leia.nextInt();
            
            switch (opcao){
                
                case 1:
                    System.out.print("\n\t Digite o numero: ");
                    numero.setNumero( leia.nextInt() );
                    break;
                case 2:
                    System.out.print("\n\t Numero atual: " + numero.getNumero() );
                    break;
                case 3:
                    System.out.print("\n\t Numero invertido: " + (numero.inverter()));
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
