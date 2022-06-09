import java.util.Scanner;

public class igual {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese 2 números");
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        if(num1 == num2){
            System.out.println("Los números son iguales");
        }
        else{
            if(num1>num2){
                System.out.println("El primer número es mayor");
            }else{
                System.out.println("El segundo número es mayor");
            }
        }
        
    }
}
