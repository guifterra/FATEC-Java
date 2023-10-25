
package usacliente;

public class Cliente {
    
    private String nome;
            String endereco;
            
    private int cpf;
    
    // Regra de negócio
    public void insereNome ( String vNome ){
       
        if( vNome.length() >= 2){
            
            nome = vNome;
        }
    }
    
    public void insereCPF ( int vCpf ){
        
        if(vCpf > 0){
            
            cpf = vCpf;
        }
    }
    
    public String retornaNome () {
        
        return nome;
    }
    
    public int retornaCpf () {
        
        return cpf;
    }
    
}
