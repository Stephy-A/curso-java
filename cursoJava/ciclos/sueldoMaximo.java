import java.util.Scanner;

public class sueldoMaximo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float sueldo, sueldoM = 0;
        int numeroS;
        System.out.println("Digite la cantidad de sueldos");
        numeroS = scr.nextInt();

        for (int i = 1; i <= numeroS; i++) {
            System.out.println("Digite el sueldo: " + i);
            sueldo = scr.nextInt();
            if (sueldo > sueldoM)
                sueldoM = sueldo;
        }
        System.out.println("El sueldo maximo es: " + sueldoM);

    }
}
