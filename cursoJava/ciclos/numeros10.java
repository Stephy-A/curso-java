import java.util.Scanner;

public class numeros10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, suma=0;
        
        for(int i=1;i<=10;i++){
            System.out.println("Ingrese otro número: ");
            num = scr.nextInt();
            suma+=num;
        }
        System.out.println("La suma de los números es: "+suma);
    }
}
