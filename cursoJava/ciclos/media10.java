import java.util.Scanner;

public class media10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num, negativo = 0, positivo = 0, contadorO = 0, contadorN = 0, contadorP = 0;
        float  mediaN = 0, mediaP = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            num = scr.nextInt();
            if (num < 0) {
                negativo += num;
                contadorN++;
                mediaN = (float) negativo / contadorN;
            } else if (num > 0) {
                positivo += num;
                contadorP++;
                mediaP = (float) positivo / contadorP;

            } else {
                contadorO++;
            }
        }

        System.out.println("La media de los número negativos es: " + mediaN + "\nLa media de los números positivos es: "
                + mediaP + "\nla cantidad de 0 ingresados es: " + contadorO);
    }
}
