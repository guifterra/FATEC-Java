
package teste;

public class BlocoDeNotasDaConta {
    
    private int numero;
    private double saldo;
    private String transacao;
    
    public BlocoDeNotasDaConta(){
        
        setNumero(1);
        setSaldo(0.0);
        setTransacao("Abertura");
    }
    
    public int getNumero(){
        
        return numero;
    }
    
    public double getSaldo(){
        
        return saldo;
    }
    
    public String getTransacao(){
        
        return transacao;
    }
    
    public void setNumero(int numero){
        
        if(numero >= 1){
            
            this.numero = numero;
        }
    }
    
    public void setSaldo(double saldo){
        
        if(saldo >= 0.0){
            
            this.saldo = saldo;
        }
    }
    
    public void setTransacao(String transacao){
        
        this.transacao = transacao;
    }
}
