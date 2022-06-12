import java.util.Scanner;

public class primeroUltimo {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        int numero[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.print("Ingrese un número");
            numero[i] = scr.nextInt();

        }
        for(int i=0; i<5; i++){
            System.out.println(numero[i]+" ");
            System.out.println(numero[9-i]+" ");
        }
    }
}
