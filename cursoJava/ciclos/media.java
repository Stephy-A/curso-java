import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, suma =0, contador=0;
        float media =0;
        System.out.println("Ingrese un número");
            num = scr.nextInt();
        while(num>0){
            
            suma += num;
            contador ++;
            media = suma/contador;
            System.out.println("Ingrese otro número");
            num = scr.nextInt();
        }
        System.out.println("La suma de los números es: "+suma+" y la media es: "+ media);
    }
}
