import java.util.Scanner;

public class formula2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese los valores de a,b y c");
        double a =scr.nextInt();
        double b =scr.nextInt();
        double c =scr.nextInt();

        double resultado1= (-b+Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
        double resultado2= (-b-Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
        System.out.println("La raiz 1 es: "+ resultado1);
        System.out.println("La raiz 2 es: "+ resultado2);
    }
}
