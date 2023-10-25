import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada da frase ao usuário
        System.out.print("\n Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        // Dividir a frase em palavras
        String[] palavras = frase.split("\\s+");

        // Calcular a quantidade de palavras
        int quantidadePalavras = palavras.length;

        // Criar o vetor AN com a quantidade de palavras
        String[] AN = new String[quantidadePalavras];

        // Preencher o vetor AN com as palavras
        for (int i = 0; i < quantidadePalavras; i++) {
            AN[i] = palavras[i];
        }

        // Imprimir o vetor AN original
        System.out.println("\n Vetor AN original: " + Arrays.toString(AN));

        // Ordenar o vetor AN em ordem crescente (considerando a primeira letra)
        Arrays.sort(AN, (s1, s2) -> s1.charAt(0) - s2.charAt(0));

        // Imprimir o vetor AN ordenado
        System.out.println(" Vetor AN ordenado: " + Arrays.toString(AN));
    }
}
