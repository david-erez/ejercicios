package poo;

import java.util.Scanner;

//1. Clase Persona: atributos (nombre, edad); método para mostrar si es mayor de edad.
//2. Clase CuentaBancaria: atributos (titular, saldo); métodos depositar(), retirar(), mostrarSaldo().
// 3. Clase Rectángulo: atributos (base, altura); métodos calcularÁrea(), calcularPerímetro().
// 4. Clase Estudiante: atributos (nombre, notas); métodos calcularPromedio() y determinar si aprueba.
// 5. Clase Producto: atributos (nombre, precio, cantidad); métodos calcularTotal() y aplicarDescuento().
public class Persona {
        private String nombre;
        private byte edad;
public Persona(String nombre, byte edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
public void mostrarEdad(){
          if (edad >= 18) 
        {
         System.out.println(nombre+" uested es mayor de edad "+edad);   
        }
        else{
        System.out.println(nombre+" uested tiene "+edad);
        }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("ingrese su nombre");
    String nombre = sc.nextLine();
    System.out.println("ingrese su edad:");
    byte edad = sc.nextByte();
    Persona persona =new Persona(nombre,edad );
    persona.mostrarEdad();
}
    
}
