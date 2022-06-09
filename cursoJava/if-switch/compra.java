import java.util.Scanner;

public class compra {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese el valor de su compra");
        double compra = scr.nextDouble();
        if(compra >=300){
            double descuento = (compra * 0.20);
            double total = compra-descuento;
            System.out.println("El valor de la compra es: "+compra +" y el descuento es: "+descuento);
            System.out.println("El valor total de la compra es: "+total);
        }else{
            System.out.println("El valor de la compra es: "+compra);
        }
    }
}
