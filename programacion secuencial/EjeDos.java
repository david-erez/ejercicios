//calcular el área y perímetro de un círculo dado su radio. 

import java.util.Scanner;

public class EjeDos {
private double radio;


public double getRadio()
{
    return radio;
}


public void setRadio(double radio)
{
    this.radio = radio;
}

public void calcularArea()
{
    double area = Math.PI * radio * radio;
    System.out.println("el area de el circulo es: "+ area);
}

public void  calcularPerimetro(){
    double perimetro = 2 * Math.PI * radio;
    
    System.out.println("el perimetro de el circulo es: "+perimetro );
}

public static void main(String[] args) {
    EjeDos ejem2 = new EjeDos();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingresa el radio del círculo: ");
    ejem2.setRadio(sc.nextDouble());
    
    ejem2.calcularArea();
    ejem2.calcularPerimetro();


    }
}
