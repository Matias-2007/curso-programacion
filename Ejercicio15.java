import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        int suma=0;
        int contador=0;

System.out.println("ingrese la edad (0 para salir)");
    edad= scanner.nextInt();

while (edad!=0) {
    suma+=edad;
    contador++;
    System.out.println("ingrese otra edad (0 para salir)");
    edad= scanner.nextInt();
}
System.out.println("el promedio de edades: " + (suma / contador));

}
}

