
package invertenumero;

public class Numero {
    
    private int numero;
    
    public Numero(){
        
    }
    
    public void setNumero(int numero){
        
        if(numero >= 0)
            this.numero = numero;
    }
    
    public int getNumero(){
        
        return numero;
    }
    
    public int inverter (){
        
        String numeroString = "" + numero;
        String invertido = "";
        
        for(int atual = 0; atual < numeroString.length(); atual++){
            
            invertido = numeroString.charAt(atual) + invertido;
        }
        
        return Integer.parseInt( invertido );
    }
}
