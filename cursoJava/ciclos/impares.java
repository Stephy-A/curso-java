
public class impares {
    public static void main(String[] args) {
        int producto=1;
         for(int i=1;i<=20;i+=2){
            producto *= i;
         }
         System.out.println("La multiplicación de los primeros 10 numeros impares es: "+producto);
    }
}
