// Leer la edad de una persona y mostrar si es mayor o menor de edad.

import java.util.Scanner;

public class Segundo {
    public byte edad;

    public byte getEdad() 
    {
        return edad;
    }

    public void setEdad(byte edad)
    {
        this.edad = edad;
    }

    public void votar()
    {
        if (edad >= 18) 
        {
         System.out.println("puende votar");   
        }
        else{
        System.out.println("no puede votar");
        }
    }
    public static void main(String[] args) {
        Segundo sg = new Segundo();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su edad para determinar si es mallor o menor de edad:");
        sg.setEdad(sc.nextByte());
        sg.votar();
    }
    
}
