// Evaluar la proposición: “Si un número es mayor que 10 y menor que 50,
// mostrar ‘Verdadero’, de lo contrario, ‘Falso’.”.

import java.util.Scanner;

public class EjercicioUno {
private byte number;
    
public byte getNumber() {
    return number;
}
public void setNumber(byte number) {
    this.number = number;
}
public void comprobation ()
{
if (number > 10 && number < 50) {
System.out.println("verdadero");
}
else{
    System.out.println("falso");
}
   
}
public static void main(String[] args) {
    EjercicioUno comUno = new EjercicioUno();
    System.out.println("ingrese un numero");
    Scanner sc = new Scanner(System.in);
    comUno.setNumber(sc.nextByte());
    comUno.comprobation();
}    
}