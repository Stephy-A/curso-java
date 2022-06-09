//valor = (condicion) ? valor1: valor2;
import java.util.Scanner;

public class ternario {
    public static void main(String [] args){
        Scanner scr = new Scanner(System.in);
        int num;
        String mensaje;
        System.out.println("Ingrese un numero");
        num = scr.nextInt();

        mensaje = (num%2==0) ? "Es par" : "Es impar";

        System.out.println(mensaje);
    }
}
