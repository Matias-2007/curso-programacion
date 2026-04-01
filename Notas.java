import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in); 

Integer nota;

System.out.println("ingresa una nota");
nota = scanner.nextInt();

if (nota < 10) {
    System.out.println("exelente");
}else if (nota==5) {
    System.out.println("no tenes ni chanse de aprobar jaja");
} else if (nota> 6) {
    System.out.println("muy bien");
} else if (nota<4) {
    System.out.println("desaprobaste burro");
}
scanner.close();
    }
}
