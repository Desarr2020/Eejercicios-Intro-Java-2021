import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {    

    int val = pedirNumero();

    System.out.println("--------");

    serie(val);
}

static int pedirNumero() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número :");
    int num = sc.nextInt();
    sc.close();
    return num;
}

// Imprime una secuencia de valores por cada vuelta de ciclo
static void serie(int val) {
    String valores = "";
    for (int i = 1; i <= val; i++) {
        valores += i;
        System.out.println(valores);
    }

}
}
