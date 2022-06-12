import java.util.Scanner;
//edad, estatura media mayores de 18 mas de 1.75
public class alumno {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int edad, contadorE=0, contadorS=0;
        float estatura,sumaE=0, sumaS=0, mediaE=0, mediaS=0;
        for(int i=0;i <= 5;i++){
            System.out.println("Ingrese la edad");
            edad = scr.nextInt();
            System.out.println("Ingrese la estatura");
            estatura = scr.nextFloat();
            sumaE += edad;
            sumaS += estatura;
            mediaE = (float)sumaE /i;
            mediaS = (float)sumaS/i;
            if(edad >18){
                contadorE++;
            }
            if(estatura >1.75){
                contadorS++;
            }
        }
        System.out.print("La estatura media es: "+mediaS+"\nLa edad media es: "+mediaE+"\nHay "+contadorS+" alumnos con altura mayor a 1.75\nHay "+contadorE+ " alumnos mayores de 18 años");
    }
}
