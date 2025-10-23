package arreglos;

import java.util.ArrayList;
import java.util.Scanner;

//3. Contar cuántos números positivos y negativos hay en un arreglo.
public class tres {
public static void mostrar(){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    int cantidad; 

    System.out.println("cuantos numeros va a ingresar");
    cantidad = sc.nextInt();

    for (int index = 0; index < cantidad; index++) {
            System.out.print("Ingrese un número: ");
            numbers.add(sc.nextInt());
    }

    int positive = 0;
    int negatives = 0;

    for (int num : numbers) {
        if (num > 0) {
            positive++;
        }
        if (num < 0) {
            negatives++;
        }
    }

    System.out.println("tenemos negativos la cantidad de :"+negatives);
    System.out.println("tenemos positivos la cantidad de :"+positive);
}
public static void main(String[] args) {
    mostrar();
}
}
