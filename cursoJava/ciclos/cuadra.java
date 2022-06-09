import java.util.Scanner;

public class cuadra {
    public static void main (String[]args){
        Scanner scr = new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Ingrese un numero");
        num = scr.nextInt();
        while(num >=0){
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El cuadrado del número es:  " +cuadrado);
            System.out.println("digite otro número");
            num = scr.nextInt();
        }
    }
}
