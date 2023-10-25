
package teste;

public class Teste {

    public static void main(String[] args) {
        
        BlocoDeNotasTeste ponteiro = new BlocoDeNotasTeste();
        BlocoDeNotasDaConta ponteiroDaConta = new BlocoDeNotasDaConta();
        String m;
        
        // Dados do usuario
        System.out.print("\n Nome  do usuario: " + (ponteiro.getNomeDoUsuario()));
        m = ((ponteiro.getIdade()) == 0)? "Idade nao inserida !" :"" + ponteiro.getIdade();
        System.out.print("\n Idade do usuario: " + m);
        
        // Dados da conta
        System.out.print("\n\n Numero    da conta: " + ponteiroDaConta.getNumero());
        System.out.print("\n Saldo     da conta: " + ponteiroDaConta.getSaldo());
        System.out.print("\n Transacao da conta: " + ponteiroDaConta.getTransacao() + "\n");
        
        // Alteração
        ponteiro.setNomeDoUsuario("Gabiru");
        ponteiro.setIdade(20);
        
        ponteiroDaConta.setSaldo(20);
        ponteiroDaConta.setTransacao("Deposito");
        
        // Dados do usuario
        System.out.print("\n\n\n Nome  do usuario: " + (ponteiro.getNomeDoUsuario()));
        m = ((ponteiro.getIdade()) == 0)? "Idade nao inserida !" :"" + ponteiro.getIdade();
        System.out.print("\n Idade do usuario: " + m);
        
        // Dados da conta
        System.out.print("\n\n Numero    da conta: " + ponteiroDaConta.getNumero());
        System.out.print("\n Saldo     da conta: " + ponteiroDaConta.getSaldo());
        System.out.print("\n Transacao da conta: " + ponteiroDaConta.getTransacao() + "\n\n");
    }
    
}
