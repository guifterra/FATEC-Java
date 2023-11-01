/*
 * Nome: Guilherme Fabiano Terra
 * Imprime valores primos
 */
package imprimeprimos;

public class ImprimePrimos {

    public static void main(String[] args) {
        
        System.out.println("\n");
        for(int i = 1; i <= 100; i++){
            
            if(Primo.isPrimo(i))
                System.out.print(" " + i);
        }
        
        Primo p = new Primo();
        
        System.out.println("\n");
        for(int i = 1; i <= 100; i++){
            
            p.setNumero(i);
            
            if(p.isPrimo(i))
                System.out.print(" " + i);
        }
    }
    
}
