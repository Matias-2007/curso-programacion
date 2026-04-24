import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// variables para bucle
int opciones;
int contador=0;
// variables para operaciones
int num1;
int num2;
// iniciar menu
System.out.println("bienvenido, a continuacion las opciones:");
System.out.println("1- sumar   2- restar  3-ver la cantidad de operaciones  0-salir");
opciones= scanner.nextInt();

while (opciones !=0) {

    if (opciones==1) {

        System.out.println("ingrese los numeros para sumar");
        num1 = scanner.nextInt();
         System.out.println("ingresa otro");
        num2 = scanner.nextInt();
        System.out.println("resultado: "+ (num1 + num2));

        contador++;
        
    }else if (opciones==2) {

        System.out.println("ingrese los numeros para restar");
        num1 = scanner.nextInt();
         System.out.println("ingresa otro");
        num2 = scanner.nextInt();
        System.out.println("resultado: "+ (num1 - num2));

        contador++;

    } else if (opciones==3) {  

        System.out.println("cantidad de operaciones: " + contador);

    }else {

        System.out.println("le erraste crack");

    }
System.out.println("bienvenido, a continuacion las opciones:");
System.out.println("1- sumar   2- restar  3-ver la cantidad de operaciones  0-salir");
opciones= scanner.nextInt();

}

            scanner.close();

        }
    }
