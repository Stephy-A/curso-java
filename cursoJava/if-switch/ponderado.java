import java.util.Scanner;

public class ponderado {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ponderado de 4 notas 10%, 25%, 25% y 40%");
        float nota1;
        float nota2;
        float nota3;
        float nota4;

        System.out.println("Ingrese las 4 notas: ");
        nota1 = scr.nextFloat();
        nota2 = scr.nextFloat();
        nota3 = scr.nextFloat();
        nota4 = scr.nextFloat();
        double cnota1 = nota1 * 0.10;
        double cnota2 = nota2 * 0.25;
        double cnota3 = nota3 * 0.25;
        double cnota4 = nota4 * 0.40;
        double ponderado = cnota1 + cnota2 + cnota3 + cnota4;
        System.out.println("Nota 1: "+ nota1+"\nNota 2: "+ nota2 + "\nNota 3: " + nota3 + "\nNota 4: " + nota4);
        System.out.println("Promedio de nota 1: "+ cnota1+"\nPromedio de nota 2: "+ cnota2 + "\nPromedio de nota 3: " + cnota3 + "\nPromedio de nota 4: " + cnota4);
        System.out.println("La nota final es: " + ponderado);
    }
}
