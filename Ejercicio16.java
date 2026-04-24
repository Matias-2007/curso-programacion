import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      double nota;
      double promedio=0;
      int contador=0;
      int aprobado=0;
      int desaprobado=0;

     System.out.println("ingrese una nota (0 para salir)");
      nota= scanner.nextDouble();

      while (nota !=0) {
        
       promedio+=nota;
       contador++;

       if (nota>=6) {
        System.out.println("aprobaste");
        aprobado++;
       }else{
        System.err.println("desaprobaste");
        desaprobado++;
       }
System.out.println("ingrese una nota (0 para salir)");
      nota= scanner.nextDouble();

      }
System.out.println("la cant de aprobados es: " + aprobado);
System.out.println("la cant de aprobados es: " + desaprobado);
System.out.println("el promedio: " + promedio/contador);
    }
}
