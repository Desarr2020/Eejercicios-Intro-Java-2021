
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una frase en minuscula:"); 
        String palabra=teclado.next();
        teclado.close();
        String mayuscula="";

        for (int n=0; n < palabra.length(); n++){
            char c=palabra.charAt(n);
            int ascii = (int) c;

            if (ascii >= 97 && ascii <= 122){
                mayuscula+=Character.toString((char) (ascii - 32));
            }else{
                mayuscula+=Character.toString((char) ascii);
            }

        }
        System.out.println(mayuscula);
    }
}

    