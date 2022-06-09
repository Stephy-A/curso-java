import java.util.Scanner;

public class iguales {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            System.out.println("Los números son pares");
        } else if ((num1 % 2 != 0) && (num2 % 2 != 0)){
            System.out.println("Los números son impares");
        }else{
            System.out.println("Uno de los números es impar");
        }
    }

}
