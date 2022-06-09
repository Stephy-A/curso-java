import java.util.Scanner;

public class calcular {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        float guillermo, juan, luis;
        System.out.println("Ingrese el dinero que tiene Guillermo: ");

        guillermo = scr.nextFloat();
        luis = guillermo /2;
        juan = (guillermo + luis) /2;
        System.out.println("Juan tiene : " + juan + "\nLuis tiene: "+luis);
    }
}
