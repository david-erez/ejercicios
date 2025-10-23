package arreglos;
//2. Mostrar el mayor y menor valor de un arreglo de 10 elementos.

import java.util.Scanner;

public class Dos {
public static void mostrar(){
    Scanner sc = new Scanner(System.in);

int[] num = new int[10];

for (int i = 0; i < num.length; i++) {
    System.out.println("ingrese el numero"+(i+1)+": ");
    num[i] = sc.nextInt();
        
    int mayor = num[0];
    int menor = num[0];

    for (int j = 0; j < num.length; j++) {
        if (num[i] > mayor) {
            mayor = num[i];
        }
        if (num[i] < menor) {
            menor = num[i];
        }
    }
System.out.println("el numero mayor es:"+mayor);
System.out.println("el nuemro menor es:"+menor);
    }
}  
public static void main(String[] args) {
    mostrar();
}      
    }



