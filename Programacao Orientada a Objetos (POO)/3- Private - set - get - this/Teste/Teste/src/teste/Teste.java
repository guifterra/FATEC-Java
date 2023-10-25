
package teste;

public class Teste {

    public static void main(String[] args) {
        
        BlocoDeNotas ponteiro = new BlocoDeNotas();
        
        // Se deu mal por conta do private impedir
        
        /*
        System.out.print("\n Dia: " + ponteiro.dia);
        System.out.print("\n Texto: " + ponteiro.texto + "\n");
        */
        
        System.out.print("\n Dia: " + ponteiro.getDia());
        System.out.print("\n Texto: " + ponteiro.getTexto() + "\n");
        
        /*
            + : Indica ser public
            - : Indica ser private
              : Nada significa ser padrão do java
        
            Bloco de notas: + (Classe)
                Dia: - (Atributo)
                Texto: - (Atributo)
                
                (MÉTODOS)
                + Bloco de notas(): É o construtor
                + getDia() : É acessor (get - pegar)
                + getTexto() : É acessor (get - pegar)
                + setDia() : É acessor (set - atribuir / setar)
                + setTexto() : É acessor (set - atribuir / setar)
                
        */
        
        ponteiro.setDia("01 - 01 - 2023");
        ponteiro.setTexto("Muito Loko");
        
        System.out.print(" Dia: " + ponteiro.getDia());
        System.out.print("\n Texto: " + ponteiro.getTexto() + "\n\n");
    }
    
}
