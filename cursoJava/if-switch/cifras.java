import java.util.Scanner;

public class cifras {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número de 0 a 99.999");
        num = scr.nextInt();
        if((num>=0) && (num<=9)){
            System.out.println("El número es de 1 cifra");
        }
        else if ((num>=10) && (num<=99)){
            System.out.println("El númewro es de 2 cifras");
        }
        else if ((num>=100) && (num<=999)){
            System.out.println("El númewro es de 3 cifras");
        }
        else if ((num>=1000) && (num<=9999)){
            System.out.println("El númewro es de 4 cifras");
        }
        else if ((num>=10000) && (num<=99999)){
            System.out.println("El númewro es de 5 cifras");
        }
    }
}
