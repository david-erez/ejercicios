package poo;
//2. Clase CuentaBancaria: atributos (titular, saldo); métodos depositar(), retirar(), mostrarSaldo().

import java.util.Scanner;

public class CuentaBancaria {
    private String  titular;
    private int saldo = 0;
    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }    
 public int depositar(int value){
    if (value > 0 ) {
    saldo += value;
    return saldo;    
    }
    else{
        return 0;
    }

    }
public int retirar(int value){
    if (value > 0 || value < saldo) {
    saldo -= value;
    return saldo;    
    }
    else{
        return 0;
    }


}
public int mostrarSaldo(){
    return saldo;
}  
public static void main(String[] args) {
    CuentaBancaria cuentaBancaria = new CuentaBancaria("cuenta bancaria", 0);
    Scanner sc = new Scanner(System.in);
    byte valor = 0;     
 do {
    System.out.println("que desea haere el ususario? \n 1.depositar \n 2.retirar \n 3.mostrar el saldo \n 4.para salir ");
    valor =sc.nextByte();  
    int depositar;
    int retirar; 
    
    switch (valor) {
            case 1:
        System.out.println("cuanto desea depositar: ");
        depositar = sc.nextInt();
        System.out.println(cuentaBancaria.depositar(depositar));
        
            break;
           case 2:
        System.out.println("cuanto desea retirar: ");
        retirar = sc.nextInt();
        System.out.println(cuentaBancaria.retirar(retirar));
            break;
            case 3:
        System.out.println("su saldo es: ");
        System.out.println(cuentaBancaria.mostrarSaldo());
            break;
                 case 4:
        System.out.println("CHAO");
            break;
    
        default:
            break;
    }      
 } while (valor != 4);
}
}
