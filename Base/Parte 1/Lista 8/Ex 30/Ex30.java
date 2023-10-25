import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a dimensão do vetor AK ao usuário
        System.out.print("\n Digite a dimensão do vetor AK: ");
        int dimensao = scanner.nextInt();

        // Criar o vetor AK e preenchê-lo com os elementos fornecidos pelo usuário
        double[] AK = new double[dimensao];
        
        for (int i = 0; i < dimensao; i++) {
            
            System.out.print("\n Digite o elementos do vetor AK: ");
            AK[i] = scanner.nextDouble();
        }

        // Ordenar o vetor AK em ordem crescente
        Arrays.sort(AK);

        // Criar o vetor AL com a média entre cada dois elementos do vetor AK
        double[] AL = new double[dimensao - 1];
        for (int i = 0; i < dimensao - 1; i++) {
            AL[i] = (AK[i] + AK[i + 1]) / 2;
        }

        // Imprimir os vetores AK e AL
        System.out.println(" Vetor AK ordenado: " + Arrays.toString(AK));
        System.out.println(" Vetor AL com média entre elementos: " + Arrays.toString(AL));
    }
}
