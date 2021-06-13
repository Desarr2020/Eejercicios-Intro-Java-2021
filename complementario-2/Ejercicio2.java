import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Lista inicial");
        System.out.println("Tamaño: " + numbers.size());
        for (int i : numbers) {
            System.out.println(i);
        }

        numbers.add(0, 0);
        numbers.add(6);
        System.out.println("Lista final con el agregado de un numero al princio y otro a l final :");
        System.out.println("Tamaño: " + numbers.size());
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}