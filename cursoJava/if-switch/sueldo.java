import java.util.Scanner;

public class sueldo {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Sueldo semanal");
        float valor;
        int hora;
        System.out.println("Ingrese el valor por hora: ");
        valor =scr.nextFloat();
        System.out.println("Ingrese las horas laboradas: ");
        hora =scr.nextInt();
        float sueldo = valor * hora;

        System.out.println("Las horas ingresadas son: "+ hora + "\nEl valor por hora es: "+ valor + "\nEl sueldo correspondiente es: " + sueldo);
     


    }
}
