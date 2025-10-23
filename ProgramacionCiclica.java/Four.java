//4. Contar cuántos números pares hay entre 1 y 50.

public class Four {
public static void par(){
    byte number = 1 ;
    byte suma = 0;
    do {
        if (number % 2 == 0) {
         suma ++;   
        }
        else{}
        number++;
    } while (number <= 50);
    System.out.println("el total de numeros pares es el siguiente;"+suma);
}
public static void main(String[] args) {
    par();
}
}
