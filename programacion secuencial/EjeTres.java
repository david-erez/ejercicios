//Leer el precio de un producto y calcular su valor con IVA (19%).

import java.util.Scanner;

public class EjeTres {
   private double precio;

   public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public void calcularIva(){
        double resultado = precio * 0.19;
        System.out.println("el iva de el producto es: "+resultado);
        
    }
    public static void main(String[] args) {
        EjeTres ejem3 = new EjeTres();
        Scanner cs = new Scanner(System.in);
        System.out.println("ingrese el precio de el producto");
        ejem3.setPrecio(cs.nextDouble());
        ejem3.calcularIva();
    }


   
}
