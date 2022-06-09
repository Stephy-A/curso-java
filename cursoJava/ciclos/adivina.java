import java.util.Scanner;

public class adivina {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, num1, contador =0;
        System.out.println("Para adivinar el número debes ingresar un número: ");
        num = scr.nextInt();
        num1 = (int)(Math.random()*100);
        do{
            if(num<num1){
                System.out.println("El número es mayor");
            }else{
                System.out.println("El número es menor");
            }
            contador++;
            System.out.println("Ingresa otro número: ");
            num = scr.nextInt();
        }while(num != num1);
        System.out.println("Felicidades lo lograste en: "+contador + " intentos");
    }
}
