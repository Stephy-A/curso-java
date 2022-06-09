import java.util.Scanner;

public class fecha {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese el día, mes y año");
        dia = scr.nextInt();
        mes = scr.nextInt();
        anio = scr.nextInt();
        if ((dia <= 30) && (mes <= 12) && (anio != 0)) {
            System.out.println("La fecha es: " + dia + "/" + mes + "/" + anio);

        } else {
            System.out.println("Error al ingresar la fecha");
        }
    }

}
