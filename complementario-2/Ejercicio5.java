import java.util.*;

public class Ejercicio5{
    public static void main(String[] args) {
        Integer[] horas = {8, 12, 8, 16, 8};
        Integer[] valorHora = {400, 450, 600, 670, 450};
        Integer[] total = new Integer[5];
        Integer totalFinal=0;
        
        for(int i= 0; i<horas.length; i++){
            total[i] = horas[i] * valorHora[i];
            totalFinal+= total[i];
        }
        
        
        System.out.println( Arrays.toString(total));
        System.out.println("Total final: $ " + totalFinal);

    }
    
}