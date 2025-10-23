package arreglos;
//5. Leer N notas en un arreglo y calcular1 cuántas son aprobadas (≥3.0).

import java.util.ArrayList;
import java.util.Scanner;

public class Cinco {
public static void calcularNotas(){
     Scanner sc = new Scanner(System.in);
    ArrayList<Double> numbers = new ArrayList<>();
    int cantidad; 

    System.out.println("cuantos notas va a ingresar?");
    cantidad = sc.nextInt();

    for (int index = 0; index < cantidad; index++) {
            System.out.print("Ingrese una nota: ");
            numbers.add(sc.nextDouble());
    }
    double suma = 0;        

  int aprobadas = 0;
        for (double nota : numbers) {
            if (nota >= 3.0) {
                aprobadas++;
            }
        }

        System.out.println("Cantidad de notas aprobadas: " + aprobadas);
    }

public static void main(String[] args) {
    calcularNotas();
}
}
