import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int edad=0 , opciones;
       
       System.out.println (" bienvenido por facor elige las siguientes opciones");
       System.out.println ("1- ingresar edad 2-ver acceso 0-salir");
        opciones= scanner.nextInt();

        while (opciones !=0) {
            
        switch (opciones) {
            case 1:
                System.out.println (" ingresar edad ");
                 edad= scanner.nextInt();
                break;
            case 2:
               if (edad <= 16) {
                System.out.println("no podes entrar wuachin");
                
               } else if (edad <= 18) {
            
                System.out.println("podes entrar con permiso");
               } else {
                System.out.println("podes entrar");
               }

             break;

            default:
                break;
        }
        System.out.println (" bienvenido por facor elige las siguientes opciones");
       System.out.println ("1- ingresar edad 2-ver acceso 0-salir");
        opciones= scanner.nextInt();

        }
     scanner.close();

    }
}
