import java.util.Scanner;

// codigo art, cantidad en lt, precio lt. facturación total, cantidad e litro del art 1, fact+600
public class factura {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int codigo, litro = 0, totalLt = 0, litro1 = 0, facturaM = 0;
        float precio, total, facturaT = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese codigo de producto ");
            codigo = scr.nextInt();
            System.out.println("Ingrese los litros");
            litro = scr.nextInt();
            System.out.println("Ingrese precio por litro");
            precio = scr.nextFloat();
            total = (float) precio * litro;
            facturaT += total;
            if (codigo == 1) {
                litro1 += litro;
            }
            if (total > 600) {
                facturaM++;
            }

        }
        System.out.println("La facturación total es: " + facturaT + "\nLos litros vendidos del articulo 1 es: " + litro1
                + "\nLas facturas mayores a 600 son: " + facturaM);

    }
}
