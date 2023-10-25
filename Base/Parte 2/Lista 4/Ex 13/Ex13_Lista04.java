
package ex13_lista04;

import java.util.Scanner;
import java.util.Random;

public class Ex13_Lista04 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in );
        Random gerador = new Random();
        
        int quantidadeDeElemenros;
        
        System.out.print("\n Entre com a quantidade de elementos: ");
        quantidadeDeElemenros = leia.nextInt();
        
        if(quantidadeDeElemenros > 0){
            
            int elementos[] = new int[quantidadeDeElemenros];
            
            for(int i = 0; i < elementos.length; i++){
                System.out.print("\n Entre com o elemento: ");
                elementos[i] = leia.nextInt();
            }
            
            String elementosPerfeitos = "";
            elementosPerfeitos = acharElementosPerfeitos(elementos);
            
            System.out.print("\n\t >> " + elementosPerfeitos + "\n\n");
            
        }else{
            System.out.print("\n\t Erro! Valor invalido. \n\n");
        }
        
    }
    
    static String acharElementosPerfeitos(int[] elementos){
        
        String respostas = "";
        
        int soma;
        
        for(int i = 0; i < elementos.length; i++){
            
            soma = 0;
            
            for(int numero = elementos[i] - 1; numero >= 1; numero--){
                
                if(elementos[i] % numero == 0)
                    soma += numero;
                
            }
            
            if(soma == elementos[i])
                respostas += elementos[i] + " ";
            
        }
        
        return respostas;
    }
    
}
