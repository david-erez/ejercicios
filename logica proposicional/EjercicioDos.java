//Determinar si una persona puede votar: edad ≥ 18 y nacionalidad = 'colombiana'.

import java.util.Scanner;

public class EjercicioDos {
  private String nacionalidad;
  private byte edad;

  public String getNacionalidad() 
  {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) 
  {
    this.nacionalidad = nacionalidad;
  }
  public byte getEdad() {
    return edad;
  }
  public void setEdad(byte edad) 
  {
    this.edad = edad;
  }
  public void votar()
  {
    if (edad >= 18 && nacionalidad.equals("colombiana"))  {
        System.out.println("puede votar");
    }
      else
     {
    System.out.println("no puede votar");
    }
  }
  public static void main(String[] args) {
    EjercicioDos eje2 = new EjercicioDos();
    System.out.println("ingrese su edad");
    Scanner sc = new Scanner(System.in);
    eje2.setEdad(sc.nextByte());
    sc.nextLine();
    System.out.println("ingrese su nacionalidad");
    eje2.setNacionalidad(sc.nextLine());
    eje2.votar();
  }

   
  
}
