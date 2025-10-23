// Verificar si un número no está entre 20 y 40.

import java.util.Scanner;

public class EjercicioTres {
  private byte number;

  public byte getNumber() 
  {
    return number;
  }

  public void setNumber(byte number) 
  {
    this.number = number;
  }

  public void verification(){
    if (number >= 20 && number <= 40) 
    {
        System.out.println("el numero se encuentra entre 20 y 40");
    }
    else
    {
        System.out.println("el numero no se encuetra etre 20 y 40");
    }
  }
  public static void main(String[] args) {
    EjercicioTres eje3 = new EjercicioTres();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("ingrsese un numero");
    eje3.setNumber(sc.nextByte());

    eje3.verification();

  }
  
}
