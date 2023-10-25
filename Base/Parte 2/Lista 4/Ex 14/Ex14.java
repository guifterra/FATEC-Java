
package ex14;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        Random gerador = new Random();
        
        System.out.print("\n Entre com um numero: ");
        int numero = leia.nextInt();
        
        int numeroInvertido = identificaNInvertido(numero);
        
        System.out.print("\n\t >> " + numeroInvertido + "\n\n");
        
        
    }
    
    static int identificaNInvertido(int numero){
        
        int NInvertido = 0;
        
        boolean isNegativo = false;
        
        String valor = numero + "";
        String valorInvertido = "";
        
        for(int i = 0; i < valor.length(); i++){
            
            if((valor.charAt(i)) == '-'){
                
                isNegativo = true;
                
            }else{
                
                valorInvertido = (valor.charAt(i)) + valorInvertido;
            }
            
        }
        
        if(isNegativo)
            valorInvertido = '-' + valorInvertido;
        
        NInvertido = Integer.parseInt(valorInvertido);
        
        return NInvertido;
    }
    
}
