import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, factorial=1;
        System.out.println("Ingrese un número");
        num =scr.nextInt();
        for(int i=1; i<=num; i++){
            factorial *= i;
         
        }
        System.out.println("EL factorial del numero"+ num+ " es: "+factorial);
        }
}
