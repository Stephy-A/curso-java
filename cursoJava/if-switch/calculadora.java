import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        char operacion;
        int num1, num2, sum, rest,multi, divi, mod;
        System.out.println("Ingrese la inicial de la operación que desa realizar: \nSuma, resta, multiplicación o división");
        operacion = scr.nextLine().charAt(0);
        System.out.println("Ingrese 2 números");
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        switch(operacion){
            case 's':
            case 'S':
                sum = num1 + num2;
                System.out.println("La suma de los números: "+num1+ " y " +num2 +" es: "+ sum);
            break;
            case 'r':
            case 'R':
                rest = num1 - num2;
                System.out.println("La resta de los números: "+num1+ " y " +num2 +" es: "+ rest);
                break;
            case 'm':
            case 'M':
                multi = num1 * num2;
                System.out.println("La multiplicación de los números: "+num1+ " y " +num2 +" es: "+ multi);
                break;
            case 'd':
            case 'D':
                divi = num1 / num2;
                mod = num1 % num2; 
                System.out.println("La división de los números: "+num1+ " y " +num2 +" es: "+ divi +" y el residuo es: "+mod);
                break;
            }
    }
}
