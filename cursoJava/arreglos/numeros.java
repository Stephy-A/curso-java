import java.util.Scanner;

public class numeros {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        int numero[] = new int[5];
        for(int i=0; i<=4; i++){
            System.out.println("Ingrese un número");
            numero[i] = scr.nextInt();
        }
        for(int i=4; i>=0;i--){
            System.out.print(numero[i] +" ");
        }
    }
}
