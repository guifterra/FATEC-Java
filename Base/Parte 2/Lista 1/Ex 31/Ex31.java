
package ex31;

import java.util.Random;
import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        Random gerador = new Random();
        
        int linha, coluna, valorMin, valorMax, matriz[][];
        
        do{
            System.out.print("\n Entre com a quantidade de linhas: ");
            linha = leia.nextInt();
            
        }while(linha <= 1);
        
        do{
            System.out.print("\n Entre com a quantidade de coluna: ");
            coluna = leia.nextInt();
            
        }while(coluna <= 1);
        
        do{
            System.out.print("\n Entre com o valor minimo: ");
            valorMin = leia.nextInt();
            
        }while(valorMin <= 0);
        
        do{
            System.out.print("\n Entre com o valor maximo: ");
            valorMax = leia.nextInt();
            
        }while(valorMax <= 0);
        
        matriz = new int[linha][coluna];
        
        System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
        for(int i = 0; i < matriz.length; i++){
            
            for(int j = 0; j < matriz[i].length; j++){
                
                matriz[i][j] = valorMin + gerador.nextInt(valorMax + 1 - valorMin);
                System.out.printf(" [ %02d ]", matriz[i][j]);
                
            }
            System.out.println("\n");
        }
        
    }
    
}
