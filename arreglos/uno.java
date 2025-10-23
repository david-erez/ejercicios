package arreglos;

import java.util.Scanner;

//1. Leer 5 números en un arreglo y mostrar su suma total.
//2. Mostrar el mayor y menor valor de un arreglo de 10 elementos.
//3. Contar cuántos números positivos y negativos hay en un arreglo.
//4. Invertir el contenido de un arreglo y mostrarlo.
//5. Leer N notas en un arreglo y calcular1 cuántas son aprobadas (≥3.0).

public class uno{

    // Método para llenar el arreglo y mostrar los números
    public static void arreglos() {
        Scanner entrada = new Scanner(System.in);
        int[] number = new int[5];
        int suma = 0;

        System.out.println("ingresa los 5 números:");

        for (int i = 0; i < number.length; i++) {
            System.out.print("numero " + (i + 1) +": ");
            number[i] = entrada.nextInt(); 
            suma += number[i];
        }

        System.out.println("la suma de los numeros ingresados es:"+suma);
    }

    public static void main(String[] args) {
        arreglos();
    }
}


