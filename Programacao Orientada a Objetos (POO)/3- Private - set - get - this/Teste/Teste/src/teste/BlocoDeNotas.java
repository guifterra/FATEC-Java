
package teste;

public class BlocoDeNotas {
    
    // Bloqueia edição externa
    private String dia;
    private String texto;
    
    // Método construtor - Sempre existe - pode ser criado manualmente pra definir val iniciais
    // Como declarar?
    
    // public NomeDaClasse(){}
    public BlocoDeNotas(){
        
        dia = "00 - 00 - 0000";
        texto = "Sem anotações por enquanto \n";
    
    }
    
    /*
    
        Funciona mas n da pra saber o nome

        public String getDia(){

            return dia;
        }

        public String getTexto(){

            return texto;
        }

        public void setDia(String vDia){

            dia = vDia;
        }

        public void setTexto(String vTexto){

            texto = vTexto;
        }
    
    */
    
    public String getDia(){
        
        return this.dia;
    }
    
    public String getTexto(){
        
        return this.texto;
    }
    
    public void setDia(String Dia){
        
        this.dia = Dia;
    }
    
    public void setTexto(String Texto){
        
        this.texto = Texto;
    }
}
    
