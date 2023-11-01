
package imprimeprimos;

public class Primo {
    
    private int numero;
    
    public Primo(){
        
        setNumero( 1 );
    }
    
    public Primo (int numero){
        
        setPrimo(numero);
    }
    
    private void setPrimo ( int numero ){
        
        setNumero(1);
        setNumero (numero);
    }
    
    public void setNumero( int numero ){
        
        if( numero > 0){
            
            this.numero = numero;
        }
    }
    
    public int getNumero(){
        
        return this.numero;
    }
    
    public boolean isPrimo () {
        
        int contador = 0;
        
        for( int i = 1; i <= numero; i++){
            
            if(numero % i == 0)
                contador++;
        }
        
        return (contador == 2);
    }
    
    public static boolean isPrimo (int numero){
        
        int contador = 0;
        
        for( int i = 1; i <= numero; i++){
            
            if(numero % i == 0)
                contador++;
        }
        
        return (contador == 2);
    }
}
