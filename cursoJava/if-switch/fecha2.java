import java.util.Scanner;

public class fecha2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese día, mes y año");
        dia = scr.nextInt();
        mes = scr.nextInt();
        anio = scr.nextInt();
        if ((anio != 0)) {
            if ((mes > 0) && (mes < 12)) {
                if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
                    if ((dia > 0) && (dia <= 31)) {
                        System.out.println("1.La fecha es : " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("El día ingresado es incorecto");
                    }
                } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                    if ((dia > 0) && (dia <= 30)) {
                        System.out.println("2.La fecha es : " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("El día ingresado es incorecto");
                    }
                } else if (mes == 2) {
                    if ((dia > 0) && (dia <= 28)) {
                        System.out.println("3.La fecha es : " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("El día ingresado es incorecto");
                    }
                }
            } else {
                System.out.println("El mes ingresado es incorrecto");
            }
        } else {
            System.out.println("El año ingresado es incorrecto");
        }
    }
}
