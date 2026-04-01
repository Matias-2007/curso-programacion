import java.util.Scanner;

public class Main {

public static void main(String[] args) {
   
Scanner scanner= new Scanner(System.in);
   System.out.print("ingresa tu nombre");

   String user = scanner.nextLine();

System.out.print("hola " + user + " ingresa tu edad");

Integer edad = scanner.nextInt();

System.out.print("tu edad es " + edad + "bienvenido "+ user);

}

}
