
//Verificar si un año es bisiesto: (año % 4 == 0 y año % 100 != 0) o (año % 400 == 0).

import java.util.Scanner;

public class EjercicioCinco {
    private int año;

    public int getAño() 
    {
        return año;
    }

    public void setAño(int año)
    {
        this.año = año;
    }

    public void comprobarAño(){
        if ((año % 4 == 0  && año % 100  != 0) || (año % 400 == 0)) 
        {
            System.out.println("el año "+ año + " es bisiesto");
        }
        else
        {
            System.out.println("el año "+ año + " no es bisiesto");
            
        }
    }

    public static void main(String[] args) {
        
        EjercicioCinco eje5 = new EjercicioCinco();
        System.out.println("ingrese un año para saber si es bisiesto");
        Scanner sc = new Scanner(System.in);
        eje5.setAño(sc.nextInt());
        eje5.comprobarAño();
    }
}
