import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int b=1;
System.out.println("que onda pa ingresa tu contraseña (5 digitos)");

num= scanner.nextInt();
 
while (num!=12345& b<=3) {
    System.out.println("tu contraseña es incorrecta");

    System.out.println("intenta de nuevo");
    num= scanner.nextInt();
    b++;
 } if (b==3) {
    System.out.println("no te acordas por burro jaja");
 }else{

    System.out.println("entraste");
 }


    }
}
