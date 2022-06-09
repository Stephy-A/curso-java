import java.util.Scanner;

public class operadores {
    public static void main (String [] args) {
        System.out.println("Operaciones aritmeticas"); 
        System.out.println("Ingrese dos numeros: ");
        float num1, num2, sum, rest, multi, div, resto;

        Scanner entrada = new Scanner(System.in);
        num1= entrada.nextFloat();
        num2= entrada.nextFloat();

        sum = num1 + num2;
        rest = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;

        System.out.println("La suma de los números: "+ num1  + " y " + num2 + " es: " + sum);
        System.out.println("La resta de los números: "+ num1  + " y " + num2 + " es: " + rest);
        System.out.println("La multiplicación de los números: "+ num1  + " y " + num2 + " es: " + multi);
        System.out.println("La división de los números: "+ num1  + " y " + num2 + " es: " + div);
        System.out.println("El residuo es : "+ num1  + " y " + num2 + " es: " + resto);

        double resultado = Math.sqrt(num1);
        System.out.println("Raiz cuadrada "+ resultado);

        double resultado1 = Math.pow(num1, num2);
        System.out.println("Potencia "+ resultado1);
    }
}
