//1. Determinar si un número es par o impar.

import java.util.Scanner;

public class Primero {
 private int num;
 
 public void determinar()
 {
    if (num % 2 == 0) 
    {
        System.out.println("el numero "+num+" es par");
    }
    else
    {
        System.out.println("el numero  "+num+" es impar");
    }
    }
    public int getNum() 
    {
    return num;
    }
    public void setNum(int num) 
    {
    this.num = num;
    }
 public static void main(String[] args) {
    Primero pm = new Primero();
    Scanner sc = new Scanner(System.in);
    System.out.println("ingrese un numero para determinar si es par o impar");
    pm.setNum(sc.nextInt());
    pm.determinar();


 }

}
