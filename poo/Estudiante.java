package poo;
// 4. Clase Estudiante: atributos (nombre, notas); métodos calcularPromedio() y determinar si aprueba.

public class Estudiante {
    private String nombre;
    private double[] notas;

public Estudiante(String nombre, double[] notas) {
    this.nombre = nombre;
    this.notas = notas;
}

public double calcularPromedio() {
    double suma = 0;
    for (double nota : notas) {
        suma += nota;
    }
    return suma / notas.length;
}

public void determinaAprueba() {
    double promedio = calcularPromedio();
    if (promedio >= 60) {
        System.out.println(nombre + " ha aprobado con un promedio de: " + promedio);
    } else {
        System.out.println(nombre + " no ha aprobado con un promedio de: " + promedio);
     }
}

    public static void main(String[] args) {
        double[] notas = {75.5, 82.0, 68.5, 90.0};
        Estudiante estudiante = new Estudiante("Juan", notas);
        estudiante.determinaAprueba();
    }
    
}
