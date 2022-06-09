import java.util.Scanner;

public class venta {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int auto;
        float valor_vendido;
        
        System.out.println("Calcular el salario mas 150 y el 5% por comisión por auto");
        System.out.println("Cuantos autos vendio este mes: ");
        auto = scr.nextInt();
        System.out.println("cual fue el valor de cada auto: ");
        valor_vendido = scr.nextFloat();
        float comision1 = auto *150;
        double valor_total = auto * valor_vendido;
        double comision2 = valor_total * 0.05;
        double sueldo= 1000 + comision1+ comision2;
        System.out.println("Autos vendidos: "+ auto + " Valor total de venta: "+ valor_total);
        System.out.println("La comisión de 150 por auto es: "+ comision1 + " La comisión de 5% es: "+comision2);
        System.out.println("El sueldo total es: "+ sueldo);

    }
}
