import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
            num = scr.nextInt();
            if((num >0) && (num <10)){
                for(int i=1; i<=12; i++){
                    System.out.println(num + "*"+ i +"="+num * i);
                }
            }
    }
}
