//5. Evaluar la nota final de un estudiante y asignar una categoría (Excelente, Bueno, Insuficiente).

import java.util.Scanner;

public class Quinto {
    private double nota;

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrarCategoria() {
        int clave = (int) (nota * 10); // Ej: 3.5 → 35

        switch (clave / 10) {  
            case 0:
            case 1: 
            case 2:
                System.out.println("insuficiente. su nota es: " + nota);
                break;
            case 3:
                System.out.println("aceptable. su nota es: " + nota);
                break;
            case 4:
                if (nota < 4.6) {
                    System.out.println("bueno. su nota es: " + nota);
                } else {
                    System.out.println("excelente. su nota es: " + nota);
                }
                break;
            case 5:
                System.out.println("excelente. eu nota es: " + nota);
                break;
            default:
                System.out.println("nota inválida.debe estar entre 0.0 y 5.0");
        }
    }

    public static void main(String[] args) {
        Quinto q = new Quinto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante:");
        q.setNota(sc.nextDouble());

        q.mostrarCategoria();
    }
}
