
package ex05_lista4;

import java.util.Scanner;
import java.util.Random;

public class Ex05_Lista4 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        Random gerador = new Random();
        
        int quebra = 15, quantidade= 0;
        
        for(int numero = 1; numero <= 1000; numero++){
            
            boolean resultado = isPrimo(numero);
            
            if(resultado){
                quantidade++;
                System.out.print(" " + numero);
                if(quantidade % quebra == 0)
                    System.out.println("\n");
            }
        }
        System.out.println("\n");
        
    }
    
    static boolean isPrimo(int numero){
        
        int d = 0;
        boolean resultado = false;
        
        for(int aux = numero; aux >= 1; aux--){
            
            if(numero % aux == 0)
                d++;
            
        }
        
        if(d == 2)
            resultado = true;
        
        return resultado;
    }
    
}

