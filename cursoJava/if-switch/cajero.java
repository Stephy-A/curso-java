import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int opcion;
        int dinero;
        int saldo = 1000;
        System.out.println("Seleccione la opción que desea: \n1.Ingresar dinero \n2.Retirar dinero \n3.salir");
        opcion = scr.nextInt();
        
        if(opcion ==1){
            System.out.println("Indique el valor a ingresar");
            dinero = scr.nextInt();
            saldo += dinero;
            System.out.println("El dinero ingresado es: "+dinero +" El saldo es: "+saldo);
        }else if (opcion ==2){
            System.out.println("Indique el valor a retirar");
            dinero = scr.nextInt();
            if(dinero < saldo){
                saldo -= dinero;
                System.out.println("El dinero retirado es: "+dinero +" El saldo es: "+saldo);
            }else{
                System.out.println("No hay fondos suficientes");
            }
            
        }else if (opcion ==3){
            System.out.println("Gracias por usar nuestro servicio");
        }else{
            System.out.println("La opción ingresada no es valida");
        }
    }
}
