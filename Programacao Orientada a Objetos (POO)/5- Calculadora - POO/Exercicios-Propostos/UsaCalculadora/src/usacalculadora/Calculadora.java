
package usacalculadora;

public class Calculadora {
    
    // Variáveis
    private double numero1,
                   numero2;
    
    // Método construtor - Padrão
    public Calculadora(){
        
    }
    
    // Método de Sobrecarga
    public Calculadora(double numero1, double numero2){
        
        setNumero1( numero1 );
        setNumero2( numero2 );
    }
    
    // Se regra de negócio for atendida: Atribui valor do n1
    public void setNumero1(double numero1){
        
        // Altera o objeto n1
        this.numero1 = numero1;
    }
    
    // Se regra de negócio for atendida: Atribui valor do n2
    public void setNumero2(double numero2){
        
        // Altera o objeto n1
        this.numero2 = numero2;
    }
    
    // Devolve o numero1 no programa de chamada
    public double getNumero1(){
        
        // Retorna o objeto n1
        return this.numero1;
    }
    
    // Devolve o numero2 no programa de chamada
    public double getNumero2(){
        
        // Retorna o objeto n2
        return this.numero2;
    }
    
    // Retorna soma
    public double somar (){
        
        return numero1 + numero2;
    }
    
    // Retorna subtracao
    public double subtrair (){
        
        return numero1 - numero2;
    }
    
    // Retorna multiplicacao
    public double multiplicar (){
        
        return numero1 * numero2;
    }
    
    // Retorna dividir
    public double dividir (){
        
        return numero1 / numero2;
    }
    
    // Retorna soma
    public static double somar (double numero1, double numero2){
        
        return numero1 + numero2;
    }
    
    // Retorna subtracao
    public static double subtrair (double numero1, double numero2){
        
        return numero1 - numero2;
    }
    
    // Retorna multiplicacao
    public static double multiplicar (double numero1, double numero2){
        
        return numero1 * numero2;
    }
    
    // Retorna dividir
    public static double dividir (double numero1, double numero2){
        
        return numero1 / numero2;
    }
}
