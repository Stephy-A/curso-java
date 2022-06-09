import java.util.Scanner;

public class multiplo {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = scr.nextInt(); 

        String mensaje = (num%10==0) ? "Es multiplo de 10" : "No es multiplo de 10";

        System.out.println(mensaje);
    }
}
