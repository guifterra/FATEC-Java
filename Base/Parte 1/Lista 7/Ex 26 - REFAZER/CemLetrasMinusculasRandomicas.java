import java.util.Random;

public class CemLetrasMinusculasRandomicas {
	
	public static void main(String[] args){
		
		Random gerador = new Random();
		
		String texto = "";
		
		// Gerador de texto com 10 caracteres
		for(int i = 1; i <= 100; i++)
			texto += ((char)(gerador.nextInt(97, 123)));
		
		texto = "asdadaabcd";
		System.out.print("\n - - -> O TEXTO GERADO FOI: \n\n" + texto);
		
		// Letras q não pareceram na sequencia
		boolean apareceuNaSequencia;
		String caracteresQueNaoApareceram = "";
		
		for(char alfabeto = 'a'; alfabeto <= 'z'; alfabeto++){
			
			apareceuNaSequencia = false;
			
			for(int i = 0; i <= (texto.length() - 1); i++){
				
				if((texto.charAt(i)) == alfabeto){
					
					apareceuNaSequencia = true;
					break;
				}
			}
			
			if(!apareceuNaSequencia)
				caracteresQueNaoApareceram += alfabeto + " ";
		}
		
		// Impressao
		System.out.print("\n\n - - -> INFORMACOES ADICIONAIS: ");
		
		if(!(caracteresQueNaoApareceram.equals(""))){
			
			System.out.print("\n\n 1- Os caracteres q nao apareceram na sequencia sao: " + caracteresQueNaoApareceram);
		} else {
			
			System.out.print("\n\n 1- Todos os caracteres apareceram na sequencia !");
			
		}
		
		// Maior sequencia de caracteres repetidos
		String maiorSequenciaDeCaracteresRepetidos = "";
		String maiorSequenciaVogais = "";
		int menor = 0, maior = 0, quantidadeRepetida = 1, quantidadeDaMaiorSequenciaIdentificada = 0;
		String vogal = "aeiou";
		for(int i = 0; i <= (texto.length() - 2); i++){
			
			if((texto.charAt(i)) == (texto.charAt(i + 1))){
				
				quantidadeRepetida++;
				
			}else{
				
				quantidadeRepetida = 1;
				
			}
			
			if (quantidadeRepetida >= quantidadeDaMaiorSequenciaIdentificada){
				
				quantidadeDaMaiorSequenciaIdentificada = quantidadeRepetida;
				maior = i+1;
				menor = i + 2 - quantidadeDaMaiorSequenciaIdentificada;
				maiorSequenciaDeCaracteresRepetidos = texto.substring(menor, maior + 1);
				
				for(int j = 0; j <= 4; j++){
					
					if((maiorSequenciaDeCaracteresRepetidos.charAt(0)) == (vogal.charAt(j)))
						maiorSequenciaVogais = maiorSequenciaDeCaracteresRepetidos;
				}
				
			}
			
		}
		
		System.out.print("\n\n 2- Maior Seqeucnia de caracteres repetidos: " + maiorSequenciaDeCaracteresRepetidos);
		
		// Maior sequencia de vogais
		System.out.print("\n\n 3- Maior Seqeucnia de vogais repetidos: " + maiorSequenciaVogais);
		
		// Maior sequencia alfabetica
		char letra = 'a', ultimaLetra = 'a';
		int quantidadeDeLetras = 0;
		
		for(int i = 0; i <= texto.length() - 1; i++){
			
			if((texto.charAt(i)) == letra){
				
				quantidadeDeLetras++;
				letra++;
				
			} else {
			
				if(ultimaLetra <= letra)
					ultimaLetra = letra;
				
				letra = 'a';
				quantidadeDeLetras = 0;
			}
		}
			
		ultimaLetra--;
		
		String seqAlfa = "";
		for(char aux = 'a'; aux <= ultimaLetra; aux++){
			
			seqAlfa += aux;
		}
		
		System.out.print("\n\n 4- Maior Seqeucnia alfabetica repetidos: " + seqAlfa);
	}
}
