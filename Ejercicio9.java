import java.util.Scanner;
public class Ejercicio9 {

public static void main(String[] args){
Scanner scanner= new Scanner(System.in);

Integer numero1;
Integer numero2;
Integer numero3;

System.out.println("bienvenido por favor ingresa el 1º numero");
numero1 = scanner.nextInt();
System.out.println("ahora el 2º");
numero2 = scanner.nextInt();
System.out.println("y el 3º");
numero3 = scanner.nextInt();

if (numero1> numero2 & numero1> numero3) {
    System.out.println("el numero mas grande es:"+ numero1);
}else if (numero2> numero1 & numero2> numero3) {
    System.out.println("el numero mas grande es:"+ numero2);
}else {
    System.out.println("el numero mas grande es:"+ numero3);
scanner.close();
}
}
}