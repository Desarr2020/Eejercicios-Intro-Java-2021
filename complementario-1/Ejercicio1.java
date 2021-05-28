import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
      saludo();
    }  
    
   static void saludo(){
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingrese su nombre:");
        String usuario= teclado.nextLine();
        teclado.close();
    System.out.print("Hola: " + usuario );
   }
}
