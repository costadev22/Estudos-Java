package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(5);
        numeros.add(-43);
        numeros.add(4);
        numeros.add(8);

        // sort -> ordenar
        Collections.sort(numeros, Collections.reverseOrder());

        for(Integer numero : numeros){
            System.out.println(numero);
        }
     }

}
