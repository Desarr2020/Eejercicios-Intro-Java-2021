import java.util.Scanner;
public class Ejercicio2 {
 public static void main(String[] args) {
    
        int[] valores = pedirNumeros();
        int val1 = valores[0];
        int val2 = valores[1];

        System.out.println("---------");

        suma(val1, val2);
        resta(val1, val2);
        multiplicacion(val1, val2);
        division(val1, val2);
        modulo(val1, val2);   
     }
     static int[] pedirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos número enteros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        sc.close();
        int[] valores = {numero1, numero2};
        return valores;
    }
     // Calcula la suma valor1 + valor2
     static void suma(int val1, int val2) {
        int resultado = val1 + val2;
        String mensaje = String.format("%d + %d = %d", val1, val2, resultado);
        System.out.println(mensaje);
    }
    
    // Calcula la resta valor1 - valor2
    static void resta(int val1, int val2) {
        int resultado = val1 - val2;
        String mensaje = String.format("%d - %d = %d", val1, val2, resultado);
        System.out.println(mensaje);
    }
    
    // Calcula la multiplicación valor1 x valor2
    static void multiplicacion(int val1, int val2) {
        int resultado = val1 * val2;
        String mensaje = String.format("%d * %d = %d", val1, val2, resultado);
        System.out.println(mensaje);
    }
    
    // Calcula la división valor1 / valor2
    static void division(int val1, int val2) {
        double resultado = (double)val1 / val2;
        String mensaje = String.format("%d / %d = %.2f", val1, val2, resultado);
        System.out.println(mensaje);
    }
    
    // Calcula el módulo valor1 % valor2
    static void modulo(int val1, int val2) {
        int resultado = val1 % val2;
        String mensaje = val1 + " % " + val2 + " = " + resultado;
        System.out.println(mensaje);
    }
}


