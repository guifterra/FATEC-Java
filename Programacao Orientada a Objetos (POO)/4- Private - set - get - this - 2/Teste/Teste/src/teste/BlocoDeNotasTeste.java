
package teste;

public class BlocoDeNotasTeste {
    
    private String nomeDoUsuario;
    private int idade;
    
    public BlocoDeNotasTeste(){
        
        nomeDoUsuario = "Nenhum nome foi inserido ! ";
        idade = 0;
        
    }
    
    public void setNomeDoUsuario(String nomeDoUsuario){
        
        this.nomeDoUsuario = nomeDoUsuario;
    }
    
    public void setIdade(int idade){
        
        if((idade >= 1) && (idade <= 200))
            this.idade = idade;
    }
    
    public String getNomeDoUsuario(){
        
        return this.nomeDoUsuario;
    }
    
    public int getIdade(){
        
        return this.idade;
    }
}
