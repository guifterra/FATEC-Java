
package usacliente;

import java.util.Scanner;

public class UsaCliente {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        Cliente c1 = new Cliente();
        
        // Nome da classe + @ + hash code (Hexadecimal)
        System.out.print("\n " + c1);
        
        System.out.println("\n");
        
        System.out.print(" " + leia);
        
        System.out.println("\n");
        
        System.out.print(" Nome: " + c1.retornaNome());
        System.out.print("\n CPF: " + c1.retornaCpf());
        
        System.out.println("\n");
        
        //c1.nome = "Joseverson";
        //c1.cpf = -12345;
        
        System.out.print(" Nome: " + c1.retornaNome());
        System.out.print("\n CPF: " + c1.retornaCpf());
        
        System.out.println("\n");
        
        c1.insereNome("A");
        
        System.out.print(" Nome: " + c1.retornaNome());
        System.out.print("\n CPF: " + c1.retornaCpf());
        
        System.out.println("\n");
        
        c1.insereNome("Doroteia");
        
        System.out.print(" Nome: " + c1.retornaNome());
        System.out.print("\n CPF: " + c1.retornaCpf());
        
        System.out.println("\n");
        
        c1.insereCPF(-123);
        
        System.out.print(" Nome: " + c1.retornaNome());
        System.out.print("\n CPF: " + c1.retornaCpf());
        
        System.out.println("\n");
        
        c1.insereCPF(1);
        
        System.out.print(" Nome: " + c1.retornaNome());
        System.out.print("\n CPF: " + c1.retornaCpf());
        
        System.out.println("\n");
    }
    
}
