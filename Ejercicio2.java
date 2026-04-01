import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    Integer producto1, producto2, producto3,producto4,producto5;
    Integer 
    precio1 = 2500, 
    precio2 = 3400, 
    precio3= 10000,
    precio4=500,
    precio5= 8000;
   

    Integer cantProducto;
    Integer totalPrecio;
    System.out.println("ingresar la cantidad del 1º producto ");
    producto1= scanner.nextInt();
     System.out.println("ingresar la cantidad del 2º producto ");
    producto2= scanner.nextInt();
     System.out.println("ingresar la cantidad del 3º producto ");
    producto3= scanner.nextInt();
     System.out.println("ingresar la cantidad del 4º producto ");
    producto4= scanner.nextInt();
     System.out.println("ingresar la cantidad del 5º producto ");
    producto5= scanner.nextInt();

    cantProducto= 
    producto1+
    producto2+
    producto3+
    producto4+
    producto5;
totalPrecio= 
(producto1*precio1)
+(producto2*precio2)
+(producto3*precio3)
+(producto4*precio4)
+(producto5*precio5);
System.out.println("la cantidad total es: " + cantProducto + " el precio a pagar es: " + totalPrecio+" $");
scanner.close();
}
}