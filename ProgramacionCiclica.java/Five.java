//5. Leer una cantidad N de notas y calcular el promedio general usando un ciclo.
import java.util.Scanner;
public class Five {
    public static void calcularPromedioGeneral(){
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas notas va a ingresar?");
        int cantidad = sc.nextInt();
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese una nota: ");
            double nota = sc.nextDouble();
            suma += nota;
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio general de las notas es: " + promedio);
    }

    public static void main(String[] args) {
        calcularPromedioGeneral();
    }
}

