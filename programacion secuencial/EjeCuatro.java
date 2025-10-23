//4. Convertir grados Celsius a Fahrenheit.

import java.util.Scanner;

public class EjeCuatro {
    private double celcius;

    public double getCelcius() 
    {
        return celcius;
    }

    public void setCelcius(double celcius) 
    {
        this.celcius = celcius;
    }
    public void combercion()
    {
        double Fahrenheit= (celcius * 9/5)+ 32;
        System.out.println("el resultado de la convercion es :"+Fahrenheit);
    }
    public static void main(String[] args) {
        EjeCuatro ejemm4 = new EjeCuatro();
        Scanner sc = new Scanner(System.in); 
        System.out.println("ingrese los celcius que quiera convertir a fahrenheit");
        ejemm4.setCelcius(sc.nextDouble());
        ejemm4.combercion();
    }
}
