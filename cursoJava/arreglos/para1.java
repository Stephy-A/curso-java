import java.util.Scanner;

public class para1{
    public static void main(String [] args){
        Scanner scr = new Scanner (System.in);
        String[] nombres = {"Alejandro", "Maria", "Pablo", "Ana"};
        for(String i: nombres){
            System.out.println("Nombre: "+i);
        }
    }
}