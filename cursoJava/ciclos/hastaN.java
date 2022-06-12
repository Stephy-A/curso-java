import java.util.Scanner;

public class hastaN {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, i=1;
        System.out.println("Ingrese un número");
        num = scr.nextInt();
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
