import java.util.Scanner;

public class sumaIlimitados {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, num1, suma =0;
        
        do{
            System.out.println("Ingrese un número");
            num = scr.nextInt();
            suma += num;
            
        }while(num !=0);
        System.out.println("La suma de los números es: "+ suma);
    }
}
