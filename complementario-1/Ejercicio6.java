  
import java.util.Scanner;
public class Ejercicio6 {
 
//Se inicializa las variables y metodos
 public static void main(String[] args) {
      int[] valores = pedirNumeros();
        int valor1 = valores[0];
        int valor2 = valores[1];

        potencia(valor1, valor2);
}
//Se pide el ingreso de dos numeros enteros.

 static int[] pedirNumeros(){
    Scanner teclado= new Scanner(System.in);
    System.out.println("Ingrese 2 números enteros:");
    int numero1 = teclado.nextInt();
    int numero2 = teclado.nextInt();
    teclado.close();
    int[] valores = {numero1, numero2};
    return valores;
 }
   
// C Se alcula la potencia num1 elevado a num2
static void potencia(int num1, int num2) {
    int resultado = num1;
    for (int i = 1; i < num2 ; i++) {
        resultado *= num1;
    }
    String mensaje = String.format("%d elevado a %d = %d", num1, num2, resultado);
    System.out.println(mensaje);
}

        
    
    
 }


    
 

