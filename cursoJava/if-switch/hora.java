import java.util.Scanner;

public class hora {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Sacar las semanas, días y horas");
        System.out.println("Ingrese las horas");
        int horaTotal = scr.nextInt();
        float semana = horaTotal / 168;
        float dia = horaTotal % 168 / 24;
        float hora = horaTotal % 24;
        System.out.println("Las horas ingresadas son:\n" + horaTotal + "Que corresponden: \n" + semana +" Semanas, "+ dia + " días "+ hora + " horas");

    }
}
