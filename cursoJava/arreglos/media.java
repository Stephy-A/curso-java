import java.util.Scanner;

public class media {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        int contador=0, contadorN=0, contadorP=0, sumaN=0, sumaP=0;
        float mediaN=0, mediaP=0;
        int numero[] = new int[5];
        for(int i=0; i<=4; i++){
            System.out.println("Ingrese un número");
            numero[i] = scr.nextInt();
            if(numero[i] ==0){
                contador++;
            }
            else if (numero[i]<0) {
                sumaN +=numero[i];
                contadorN++;
                mediaN = (float)sumaN / contadorN;
            }
            else{
                sumaP +=numero[i];
                contadorP++;
                mediaP = (float)sumaP / contadorP;
            }
        }
        System.out.println("La media de los número positivos es: "+mediaP+"\nLa media de los número negativos es: "+mediaN+"\nLos ceros son: "+contador++);

    }
}
