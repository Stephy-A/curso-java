import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("(a+b)2 = a2 + b2 + 2ab");
        int a;
        int b;
        System.out.println("Ingrese el valor de a y b: ");
        a =scr.nextInt();
        b =scr.nextInt();
        double cuadradoA =  Math.pow(a,2);
        double cuadradoB =  Math.pow(b,2);
        double solucion = cuadradoA +cuadradoB + 2*(a*b);
        System.out.println("cuadrado de a y b: " +cuadradoA + " " +  cuadradoB);
        System.out.println("La respuesta es: "+ solucion);
    }
}
