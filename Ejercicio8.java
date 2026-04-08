import java.util.Scanner;
public class Ejercicio8 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Integer horas;
    Integer total;
System.out.println("Bienbenido, por favor ingrese la cantidad de horas que desea permanecer estacionado");
horas = scanner.nextInt();

if (horas == 1) {
    System.out.println(" el valor total de la hora es: 500$ ");
} else if ( horas<5) {
    total = 500+(horas-1)*300;
    System.out.println("el valor de la hora es: "+ total +" $");
}else if (horas>=5) {
    total= 1500;
    System.out.println("el valor de la hora es: "+ total +" $");
}
scanner.close();

}  
}