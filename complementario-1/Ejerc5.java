
import java.util.Scanner;
public class Ejerc5 {
    public static void main(String[] args) {
    int[] numeros = pedirDatos();
    int numero1 = numeros[0];
    int numero2 = numeros[1];

    System.out.println("________");

    multiplicacion(numero1, numero2);
}
  //Se pide el ingreso de dos numeros enteros


static int[] pedirDatos() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese 2 números enteros:");
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    teclado.close();
    int[] numeros = {num1, num2};
    return numeros;
}

  // Se Calcula la multiplicación 
static void multiplicacion(int num1, int num2) {
    int resultado = num1 * num2;
    String mensaje = String.format("%d x %d = %d", num1, num2, resultado);
    System.out.println(mensaje);
    }
}


    
