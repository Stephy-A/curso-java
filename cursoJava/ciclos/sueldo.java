import java.util.Scanner;

public class sueldo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int contador =0;
        float sueldo, suma=0;

        for(int i=0;i<10;i++){
            System.out.println("Ingrese un numero");
            sueldo = scr.nextInt();
            suma += sueldo;
            if(sueldo >1000){
                contador ++;
            }
        }
        System.out.println("La suma de todos los sueldos es: "+suma+"\nHay "+contador+" sueldos mayores a 1000");
    }
}
