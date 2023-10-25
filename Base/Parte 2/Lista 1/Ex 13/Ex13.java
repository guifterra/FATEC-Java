package ex13;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        
        Scanner leia   = new Scanner ( System.in );
        Random gerador = new Random();
        
        int matriz[][], dimensao;
        
        do{
            
            System.out.print("\n Entre com a dimensao: ");
            dimensao = leia.nextInt();
            
        }while(dimensao <= 1);
        
        matriz = new int[dimensao][dimensao];
        
        System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
        for(int i = 0; i < matriz.length; i++){
            
            for(int j = 0; j < matriz[i].length; j++){
                
                matriz[i][j] = gerador.nextInt(10 + 1);
                System.out.printf(" [ %02d ]", matriz[i][j]);
            }
            System.out.println("\n");
        }
        
        System.out.print(" - - -> ELEMENTOS ABAIXO DA DIAG SECUND:");
        for(int i = 0; i < matriz.length - 1; i++){
                
                System.out.printf(" [ %02d ]", matriz[i + 1][matriz.length -1 -i]);
        }
        System.out.println("\n");
        
    }
    
}
