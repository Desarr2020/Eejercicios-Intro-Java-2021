import java.util.ArrayList;
import java.util.Scanner;



public class Ejercicio2 {
    public static void main (String [] args){
        Scanner  teclado = new Scanner(System.in);
        ArrayList<Integer> numeros =listaNumeros(teclado);
        addInicio(teclado,numeros);
        addFinal(teclado,numeros);
        teclado.close();
    }

    static ArrayList<Integer> listaNumeros(Scanner teclado) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=0; i<5; i++) {
            System.out.println("************************************ ");
            System.out.println("Ingrese un número entero a la lista :");
            int numero = teclado.nextInt();
            numeros.add(numero);
        }
        return numeros;
    }

    static void addInicio(Scanner sc, ArrayList<Integer> numeros){
        
        System.out.println("Ingrese un numero al inicio de la lista : ");
        int numero = sc.nextInt();
        numeros.add(0,numero);
        System.out.println("************************************ ");
        System.out.println(numeros);
     }

    static void addFinal(Scanner sc, ArrayList<Integer> numeros){
        System.out.println("Ingrese un numero al final de la lista : ");
        int numero = sc.nextInt();
        numeros.add(numero);
        System.out.println("_________________________ ");
        System.out.println("Esta es la lista completa : " +numeros);
        System.out.println("-------------------------");
    }
}
