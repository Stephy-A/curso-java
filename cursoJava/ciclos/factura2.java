import java.util.Scanner;

public class factura2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        /*
         * int i = 0, opcion, litro1, litro2, litro3, totalL1 = 0, totalL2 = 0, totalL3
         * = 0, contador1 = 0, contador2 = 0,
         * contador3 = 0, contadorV = 0;
         * double precio, venta1 = 0, venta2 = 0, venta3 = 0,ventas1 = 0, ventas2 = 0,
         * ventas3 = 0, totalV;
         * 
         * while (i < 5) {
         * System.out.
         * println("Seleciones el codigo del producto:\n1.Producto1\n2.Producto2\n3.Producto3"
         * );
         * opcion = scr.nextInt();
         * switch (opcion) {
         * case 1:
         * System.out.println("Cuantos litros desea: ");
         * litro1 = scr.nextInt();
         * precio = 0.6;
         * venta1 = (double) litro1 * precio;
         * ventas1 += venta1;
         * totalL1 += litro1;
         * if (venta1 > 600) {
         * contador1++;
         * }
         * break;
         * case 2:
         * System.out.println("Cuantos litros desea: ");
         * litro2 = scr.nextInt();
         * precio = 3;
         * venta2 = (double) litro2 * precio;
         * ventas2 += venta2;
         * totalL2 += litro2;
         * if (venta2 > 600) {
         * contador2++;
         * }
         * 
         * break;
         * case 3:
         * System.out.println("Cuantos litros desea: ");
         * litro3 = scr.nextInt();
         * precio = 1.25;
         * venta3 = (double) litro3 * precio;
         * ventas3 += venta3;
         * totalL3 += litro3;
         * if (venta3 > 600) {
         * contador3++;
         * }
         * break;
         * }
         * i++;
         * }
         * 
         * contadorV = contador1+contador2+contador3;
         * 
         * totalV = ventas1 + ventas2 + ventas3;
         * System.out.println("Producto1: " + totalL1 + " Litros");
         * System.out.println("Producto2: " + totalL2 + " Litros");
         * System.out.println("Producto3: " + totalL3 + " Litros");
         * System.out.println("Total de ventas: " + totalV);
         * System.out.println("Ventas mayores a 600 " + contadorV);
         * }
         */
           
         int codigo, litro, facturaM=0;
         double precioL=0, total, facturaT=0;
         for(int i=1; i<=5; i++){
                do{
                    System.out.println("Ingrese el codigo");
                    codigo = scr.nextInt();
                }while (codigo<1 || codigo >3);
                System.out.println("Ingrese los litros");
                litro = scr.nextInt();

                switch(codigo){
                    case 1: precioL=0.6; break;
                    case 2: precioL=3; break;
                    case 3: precioL=1.25; break;
                }
                total = (float) precioL * litro;
                facturaT += total;
                
                if (total > 600) {
                    facturaM++;
                }
            }
            System.out.println("La facturación total es: " + facturaT
                + "\nLas facturas mayores a 600 son: " + facturaM);

        }
}
