//1. Leer dos números y mostrar su suma, resta, multiplicación y división.

import java.util.Scanner;

public class EjeUno {
    private int numOne;
    private int numTwo;
    private int resultado;

    public int getNumOne() 
    {
        return numOne;
    }
    public void setNumOne(int numOne)
    {
        this.numOne = numOne;
    }
       public int getNumTwo() 
    {
        return numTwo;
    }
    public void setNumTwo(int numTwo)
    {
        this.numTwo = numTwo;
    }
    public void suma()
    {
        resultado = numOne +numTwo;
        System.out.println(numOne+" + "+numTwo+" = "+resultado);
    }
    public void resta()
    {
        resultado = numOne - numTwo;
        System.out.println(numOne+" - "+numTwo+" = "+resultado);
        
    }
    public void multiplicacion()
    {
        resultado = numOne * numTwo;
        System.out.println(numOne+" * "+numTwo+" = "+resultado);
    }
    public void division()
    {
        resultado = numOne / numTwo;
        System.out.println(numOne+" / "+numTwo+" = "+resultado);
        
    }
    public static void main(String[] args) {
        EjeUno eje1 = new EjeUno();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese un  numero:");
        eje1.setNumOne(sc.nextInt());
        System.out.println("ingrese otro numero:");
        eje1.setNumTwo(sc.nextInt());
        
        System.out.println("suma:");
        eje1.suma();

        System.out.println("resta:");
        eje1.resta();

        System.out.println("multiplicacion:");
        eje1.multiplicacion();

        System.out.println("divicion:");
        eje1.division();

    }
}
