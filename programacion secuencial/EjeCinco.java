//5. Calcular el promedio de tres notas ingresadas por el usuario.

import java.util.Scanner;

public class EjeCinco {
    private double notaUno;
    private double notaDos;
    private double notaTres;
    public double getNotaUno() {
        return notaUno;
    }
    public void setNotaUno(double notaUno)
     {
        this.notaUno = notaUno;
    }
    public double getNotaDos() 
    {
        return notaDos;
    }
    public void setNotaDos(double notaDos)
     {
        this.notaDos = notaDos;
    }
    public double getNotaTres() {
        return notaTres;
    }
    public void setNotaTres(double notaTres) 
    {
        this.notaTres = notaTres;
    }
    public void calcularPromedio()
    {
        double promedio = (notaDos + notaTres + notaUno) / 3; 
        System.out.println("el  promedio de las notas es :"+ promedio);
    }
    public static void main(String[] args) 
    {
        EjeCinco ejemm4 = new EjeCinco();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una nota:");
        ejemm4.setNotaUno(sc.nextDouble());
        System.out.println("ingrese una nota:");
        ejemm4.setNotaDos(sc.nextDouble());
        System.out.println("ingrese una nota:");
        ejemm4.setNotaTres(sc.nextDouble());
        ejemm4.calcularPromedio();
    }
    


}
