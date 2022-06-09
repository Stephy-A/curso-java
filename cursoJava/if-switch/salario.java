import java.util.Scanner;

public class salario {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese las horas laboradas");
        int hora = scr.nextInt();
        int salario;
        if(hora <=40){
            salario = ( hora *16);
            System.out.println("El salario de: "+hora+ " horas es: "+salario);
        }
        else{
            int extra = hora-40;
            int basico = hora-extra;
            salario = ( basico *16);
           int adicional = extra * 20;
           System.out.println("El salario de las 40 horas es: "+ salario + " Las horas extras son: "+ extra + " Tienen un valor de: "+adicional);
        }
    }
}
