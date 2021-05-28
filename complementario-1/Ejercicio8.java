import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
     datosPersonales();
}
static void datosPersonales(){
   Scanner teclado=new Scanner(System.in);
   String NomAp,direccion,ciudad,edad;
   
   System.out.print("Ingresar Nombre y apellido:"); 
      NomAp=teclado.nextLine();
   System.out.print("Edad:");
      edad=teclado.next();
   System.out.print("Ingresar direccion:");
       teclado.nextLine();
      direccion=teclado.nextLine();
      
   System.out.print("Ingresar ciudad:");
      ciudad=teclado.nextLine();
   
      String impresion = String.format("%s - %s - %s años - %s", ciudad, direccion, edad, NomAp);
      System.out.println(impresion);
}
    
}
