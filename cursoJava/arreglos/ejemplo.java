import java.util.Scanner;

public class ejemplo {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        int numero[] = new int[5];
        for (int i=0; i<5;i++){
            System.out.println("Digite un número");
            numero[i] = scr.nextInt();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(int i:numero){
            System.out.print(i +" ");

        }
    }
}
