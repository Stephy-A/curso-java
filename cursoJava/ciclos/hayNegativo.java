import java.util.Scanner;

public class hayNegativo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numero;
        boolean hayN=false;

        for(int i=1; i>=10; i++){
            System.out.println("Digite el sueldo: " + i);
            numero = scr.nextInt();
            if(numero < 0){
                hayN = true;
            }
        }
        if(hayN == true){
            System.out.println("Hay negativos");
        }
        else{
            System.out.println("No hay negativos");
        }
    }
}
