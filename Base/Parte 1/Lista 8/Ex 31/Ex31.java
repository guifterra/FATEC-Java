import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a dimensão do vetor AM ao usuário
        System.out.print("\n Digite a dimensão do vetor AM (N <= 10): ");
        int dimensao = scanner.nextInt();

        // Verificar se a dimensão é válida
        if (dimensao <= 0 || dimensao > 10) {
            System.out.println("\n A dimensão do vetor deve estar entre 1 e 10.");
            return;
        }

        // Criar o vetor AM e preenchê-lo com as palavras/frases fornecidas pelo usuário
        String[] AM = new String[dimensao];
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número inteiro
        
        for (int i = 0; i < dimensao; i++) {
            
            System.out.print("\n Digite as palavras/frases do vetor AM: ");
            AM[i] = scanner.nextLine().toLowerCase();
        }

        // Imprimir o vetor AM original
        System.out.println("\n\n Vetor AM original: " + Arrays.toString(AM));

        // Ordenar o vetor AM em ordem crescente (considerando apenas a primeira frase)
        Arrays.sort(AM, (s1, s2) -> s1.split("\\.")[0].compareTo(s2.split("\\.")[0]));

        // Imprimir o vetor AM ordenado
        System.out.println(" Vetor AM ordenado: " + Arrays.toString(AM));
    }
}
