
package averiguaanobissexto;

public class Ano {
    
    private int ano;
    
    public Ano(){
        
    }
    
    public void setAno ( int ano ){
        
        if(ano > 1 && ano <= 2050){
            
            this.ano = ano;
        }
        
    }
    
    public int getAno(){
        
        return ano;
    }
    
    public boolean isBissexto(){
        
        return (ano % 4 == 0);
    }
    
}
