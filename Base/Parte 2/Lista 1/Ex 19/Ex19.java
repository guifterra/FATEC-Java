import java.util.Random;
import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner ( System.in ); 
        Random gerador = new Random();
        
        int dimensao, matriz[][];
        
        do{
            
            System.out.print("\n Entre com a dimensao da matriz: ");
            dimensao = leia.nextInt();
            
        }while(dimensao <= 1);
        
        matriz = new int[dimensao][dimensao];
        
        System.out.print("\n - - -> MATRIZ GERADA: \n\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                
                matriz[i][j] = gerador.nextInt(20 + 1);
                
                System.out.printf(" [ %02d ]", matriz[i][j]);
                
            }
            System.out.println("\n");
        }
        
        System.out.print("\n - - -> ELEMENTOS DA ASA DA BORBOLETA: \n\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                
                if(((i > j) && ((i + j) < ((matriz.length) - 1))) || (( i < j) && ((i + j) > ((matriz.length) - 1)))){
                    
                    System.out.printf(" [ %02d ]", matriz[i][j]);
                
                }else{
                    
                    System.out.printf("       ");
                }
            }
            System.out.println("\n");
        }
        
    }
    
}
