//Calcular el total a pagar con descuento si la compra es mayor a 100.000 (10% de descuento).

import java.util.Scanner;

public class Tercero {
    private double descuento = 0.10;
    private double compra; 
    public void aplicarDescuento()
    {
        if (compra > 100000) 
        {
            double result = compra * descuento;
            double total  = compra -result;
            System.out.println("se le aplica un descuento de 10% \n el valor final de su producto: "+total);
            
        }
        else
        {
            System.out.println("no aplica descuento");
        }
    }
    public void setCompra(double compra) {
        this.compra = compra;
    }
    public double getCompra() {
        return compra;
    }
    public static void main(String[] args) {
       Tercero tc = new Tercero();
       Scanner sc = new Scanner(System.in);

       System.out.println("in gresse el precio de la compra para determinar el descuento");
       tc.setCompra(sc.nextDouble());
       tc.aplicarDescuento();
    }
}
