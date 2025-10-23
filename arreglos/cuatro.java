package arreglos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//4. Invertir el contenido de un arreglo y mostrarlo.
public class cuatro {
    public static void arreglo(){
        ArrayList<Integer>arregloso = new ArrayList<>();
        arregloso.add(33);
        arregloso.add(32);
        arregloso.add(31);
        arregloso.add(355);
        arregloso.add(35);
        arregloso.add(35);
        
        Collections.reverse(arregloso);
System.out.println(arregloso);

    }
    public static void main(String[] args) {
        arreglo();
    }
}
