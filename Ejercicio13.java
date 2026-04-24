import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

int numero;
int positivo=0;

System.out.println("por favor ingresa un numero (con 0 te salis)");
numero= scanner.nextInt();
while (numero!= 0) {
    if (numero>=0) {
        positivo++;
    }


System.out.println("por favor ingresa otro");
    numero= scanner.nextInt();
}
System.out.println("la cant de numeros positivos es:" + positivo);
}
    
}