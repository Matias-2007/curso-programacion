import java.util.Scanner;
public class EjercicioParOImpar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    Integer num;
    
        System.out.println("ingrese un numero ");
        
        num = scanner.nextInt();

if (num % 2==0) {
    System.out.println("el numero es par");
}else{
    System.out.println("el numero es impar");
}
scanner.close();
    }
}
