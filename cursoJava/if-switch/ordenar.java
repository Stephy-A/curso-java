import java.util.Scanner;

public class ordenar {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese 3 números");
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        num3 = scr.nextInt();

        if((num1>num2) && (num2>num3)){
            System.out.println("1.El orden de los número es: "+ num3+", "+num2+" y "+num1);
        }
        else if((num1<num2) && (num1>num3)){
            System.out.println("2.El orden de los número es: "+ num3+", "+num1+" y "+num2);   
        }
        else if((num1<num2) && (num2<num3)){
            System.out.println("3.El orden de los número es: "+ num1+", "+num2+" y "+num3);   
        }
        else if((num1<num2) && (num2>num3)){
            System.out.println("4.El orden de los número es: "+ num1+", "+num3+" y "+num2);
        }
        else if((num1>num3) && (num3>num2)){
            System.out.println("5.El orden de los número es: "+ num2+", "+num3+" y "+num1);
        }
        else if((num1>num2) && (num1<num3)){
            System.out.println("6.El orden de los número es: "+ num2+", "+num1+" y "+num3);
        }
        else{
            System.out.println("Hay números iguales");
        }
    }
}
