//4. Programación Cíclica
//Objetivo: practicar for, while, do-while para repetir acciones.
//1. Mostrar los números del 1 al 10.
//2. Calcular la suma de los primeros N números naturales.
//3. Generar y mostrar la tabla de multiplicar de un número ingresado.
//4. Contar cuántos números pares hay entre 1 y 50.
//5. Leer una cantidad N de notas y calcular el promedio general usando un ciclo.

public class One {
    public byte number= 0;
    public void mostrarNumeros(){
        while (number<=9) {
            number++;
            System.out.println(number);
        
        }
    }
    public static void main(String[] args) {
        One one = new One();
        one.mostrarNumeros();
    }

}
