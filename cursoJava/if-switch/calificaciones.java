import java.util.Scanner;

public class calificaciones {
    public static void main(String [] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Suma de 3 calificaciones");
        System.out.println("Ingrese las 3 calificaciones: ");
        
       float nota1;
       float nota2;
       float nota3;

        nota1 = scr.nextFloat();
        nota2 = scr.nextFloat();
        nota3 = scr.nextFloat();
       float sumNota = (nota1 + nota2 + nota3);

        System.out.println("1.Nota : " + nota1 + "\n2.Nota 2: " + nota2 + "\n3.Nota 3: " + nota3 + "\nLa suma de las notas es: " + sumNota);
    }
}
