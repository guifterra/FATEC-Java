import java.util.Scanner;
import java.util.Random;

public class Ex04_Lista4 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		double notas[] = new double[3];
		
		for(int i = 0; i < notas.length; i++){
			
			System.out.print("\n Entre com a nota " + (i + 1) + " : ");
			notas[i] = leia.nextDouble();
			
			if(!((notas[i] >= 1) && (notas[i] <= 10)))
				notas[i] = 0;
			
		}
		
		double resultados[] = new double[4];
		
		resultados = calculoDoProfessor(notas);
		
		System.out.print("\n\t Media Maiores: " + resultados[0]);
		System.out.print("\n\n\t Media Aritmet: " + resultados[1]);
		System.out.print("\n\n\t Maior nota ..: " + resultados[2]);
		System.out.print("\n\n\t Menor nota ..: " + resultados[3]);
		
	}
	
	static double[] calculoDoProfessor(double notas[]){
		
		double x[] = new double[4];
		double menor;
		
		for(int i = 0; i < notas.length; i++){
			
			menor = notas[i];
			
			for(int j = i + 1; j < notas.length; j++){
				
				if(menor > notas[j]){
					
					double aux = menor;
					menor = notas[j];
					notas[j] = aux;
					
				}
			}
			
			notas[i] = menor;
		}
		
		x[0] = (notas[1] + notas[2]) / 2;
		x[1] = (notas[0] + notas[1] + notas[2]) / 3;
		x[2] = notas[notas.length - 1];
		x[3] = notas[0];
		
		return x;
		
	}
}

