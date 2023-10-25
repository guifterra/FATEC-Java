
package ex23;

import java.util.Scanner;
import java.util.Random;

public class Ex23 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        Random gerador = new Random();
        
        int linhas, coluna, matriz[][];
        
        do{
            
            System.out.print("\n Entre com a quantidade de linhas: ");
            linhas = leia.nextInt();
           
        }while(linhas < 1);
        
        do{
            
            System.out.print("\n Entre com a quantidade de coluna: ");
            coluna = leia.nextInt();
           
        }while(coluna < 1);
        
        matriz = new int[linhas][coluna];
        
        int d, aux = 1, primo = 0;
        
        System.out.print("\n\n Matriz de PRIMOS gerada: \n\n");
        for(int i = 0; i < matriz.length; i++){
            
            for(int j = 0; j < matriz[i].length; j++){
                
                d = 0;
                while(true){
                    
                    d = 0;
                    
                    for(int k = aux; k >= 1; k--){
                        if(aux % k == 0)
                            d++;
                    }
                    
                    primo = aux;
                    aux++;
                    
                    if(d == 2)
                      break;
                }
                
                matriz[i][j] = primo;
                System.out.printf(" [ %03d ]", matriz[i][j]);
                
            }
            System.out.println("\n");
        }
        
        
    }
    
}
