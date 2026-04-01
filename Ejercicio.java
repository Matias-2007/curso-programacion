import java.util.Scanner;

public class Ejercicio {
    public static void main(String[]args){
        Scanner ingreso= new Scanner(System.in);
Integer horas;
Integer sueldo;
Integer precioHora;
System.out.print("ingrese la cant, de horas: ");
horas = ingreso.nextInt(); 
System.out.print("ingrese el precio por hora: ");
precioHora = ingreso.nextInt();
sueldo = horas * precioHora;
System.out.print("el sueldo de empleado es:  " + sueldo);
    }
}