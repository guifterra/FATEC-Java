/*
 * Autor: Guilherme Fabiano Terra
 * Aula de POO - Calculadora em Programação Orientada a Objetos
 *
 */

package usacalculadora;

import java.util.Scanner;

public class UsaCalculadora {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Scanner leia = new Scanner ( System.in );
        
        double n1, n2;
        
        // Forma de Leitura 1
        System.out.print("\n Entre com o primeiro numero: ");
        n1 = leia.nextDouble();
        
        System.out.print("\n Entre com o segundo numero.: ");
        n2 = leia.nextDouble();
        
        calc = new Calculadora( n1 , n2 );
        
        /* Forma de Leitura 2
        
            System.out.print("\n Entre com o primeiro numero: ");
            calc.setNumero1( leia.nextDouble() );

            System.out.print("\n Entre com o segundo numero.: ");
            calc.setNumero2( leia.nextDouble() );
        
        */
        
        System.out.print("\n\n - - -> Resultados da calculadora: ");
        
        // Calculando com valores inseridos pelo usuário
        System.out.print("\n\n Soma.....: " + calc.somar());
        System.out.print("\n\n Diferenca: " + calc.subtrair());
        System.out.print("\n\n Produto..: " + calc.multiplicar());
        System.out.print("\n\n Divisao..: " + calc.dividir());
        
        // Enviando valores de entrada constantes
        System.out.print("\n\n - - -> Resultados da calculadora: ");
        System.out.print("\n\n Soma(8,7).....: " + calc.somar(8,7));
        System.out.print("\n\n Diferenca(8,7): " + calc.subtrair(8,7));
        System.out.print("\n\n Produto(8,7)..: " + calc.multiplicar(8,7));
        System.out.print("\n\n Divisao(8,7)..: " + calc.dividir(8,7));
        
        // Usando metodos estáticos
        System.out.print("\n\n - - -> Resultados da calculadora: ");
        System.out.print("\n\n Soma(8,7).....: " + Calculadora.somar(8,7));
        System.out.print("\n\n Diferenca(8,7): " + Calculadora.subtrair(8,7));
        System.out.print("\n\n Produto(8,7)..: " + Calculadora.multiplicar(8,7));
        System.out.print("\n\n Divisao(8,7)..: " + Calculadora.dividir(8,7));
        
        System.out.println("\n");
        
    }
    
}
