import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Integer precio;
Integer total;
System.out.println("ingresar precio del producto");

precio=scanner.nextInt();

if (precio> 5000) {
total= precio -(precio * 20)/100;
System.out.println("el precio con 20% de descuento es: " + total);
}else if (precio> 2000) {
    total=precio -(precio * 10)/100;
    System.out.println("el precio con 10% de descuento es: " + total);
}else {
System.out.println("el precio sin descuento es: " + precio);
}

    }
}
