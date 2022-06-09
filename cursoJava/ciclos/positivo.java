import java.util.Scanner;

public class positivo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = scr.nextInt();

        while (num != 0) {
            if (num > 0) {
                System.out.println("El número ingresado es positivo");

            } else {
                System.out.println("El número ingresado es negativo");

            }
            System.out.println("Ingrese otro numero");
            num = scr.nextInt();
        }
    }
}
