
public class Ejercicio4 {
    public static void main(String[] args){
       factorial(5);


    }
    static void factorial(int valor){
        int resultado =1;
        
        for (int i=1; i<= valor;i++){
        resultado*=i;
    }
    String impresion = String.format("El factorial de %d es: %d", valor, resultado);
        System.out.println(impresion);
    
  }
}
