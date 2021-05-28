import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        listaCiudades();
    }

    static void listaCiudades() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        boolean empezar = true;
        while (empezar) {
            System.out.println("Ingrese el nombre de una ciudad o presione Enter para salir:");
            String ciudad = sc.nextLine();
            if (ciudad.length() == 0) {
                empezar = false;
            }
            ciudades.add(ciudad);
        }
        sc.close();
        String decorativo = "#1 - %s";
        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).length() != 0) {
                System.out.println(String.format(decorativo, ciudades.get(i)));
            }
        }
    }
}