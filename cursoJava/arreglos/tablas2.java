import java.util.Scanner;

public class tablas2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];
        int tabla3[] = new int[20];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese los numeros de la tabla 1");
            tabla1[i] = scr.nextInt();
            System.out.println("Ingrese los numeros de la tabla 2");
            tabla2[i] = scr.nextInt();
        }
        int j=0;
        for (i=0; i<10;i++) {
            tabla3[j] = tabla1[i];
            j++;
            tabla3[j] = tabla2[i];
            j++;
        }
        for(i=0; i<20;i++){
        System.out.print(tabla3[i]+" ");
        }
    }
}
