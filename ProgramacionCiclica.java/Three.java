
//3. Generar y mostrar la tabla de multiplicar de un número ingresado.

import java.util.Scanner;

public class Three {

    public static void multiplicar(long number, long value){
        long multi = 1;
        for (int i = 0;i <= value ; i++) {
            long result = number * i;
            
            System.out.println(number+"*"+i +"="+result );
        }
    }
    public static void main(String[] args) {
    System.out.println("ingrese un numero para obtener su tabla de multiplicar hasta elnumero que desee");
    long number = new Scanner(System.in).nextLong();
    System.out.println("ingrese el valor hasta donde desea multiplicar");
    long value = new Scanner(System.in).nextLong();
     multiplicar(number, value);   
    }
}
