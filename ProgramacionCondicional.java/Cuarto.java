import java.util.Scanner;

public class Cuarto {
    private int numOne;
    private int numTwo;
    private int numThree;

    public void mostrarNumero() {
        if (numOne > numTwo && numOne > numThree) {
            System.out.println("El numero mayor es: " + numOne);
        } 
        else if (numTwo > numOne && numTwo > numThree) {
            System.out.println("El numero mayor es: " + numTwo);
        } 
        else if (numThree > numOne && numThree > numTwo) {
            System.out.println("El numero mayor es: " + numThree);
        } 
        else {
            System.out.println("Hay numeros iguales.");
        }
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public int getNumThree() {
        return numThree;
    }

    public void setNumThree(int numThree) {
        this.numThree = numThree;
    }

    public static void main(String[] args) {
        Cuarto cua = new Cuarto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        cua.setNumOne(sc.nextInt());

        System.out.println("Ingrese el segundo número:");
        cua.setNumTwo(sc.nextInt());

        System.out.println("Ingrese el tercer número:");
        cua.setNumThree(sc.nextInt());

        cua.mostrarNumero();
    }
}
