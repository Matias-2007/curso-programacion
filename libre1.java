import java.util.Scanner;
public class libre1 {
    public static void main( String[] args){
        Scanner scanner= new Scanner(System.in);
Integer anoNacimiento;
Integer anoActual;
Integer total;
System.out.println("ingresa tu fecha de nacimiento: ");
anoNacimiento= scanner.nextInt();
System.out.println("ingresa la fecha actual: ");
anoActual= scanner.nextInt();

total= anoActual-anoNacimiento;
System.out.println("su edad es: " + total);
scanner.close();
    }
}