import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     Integer horas=0 ,total=0 , inicio ;
    


 System.out.println("bienvenido");
System.out.println("ingresar las opciones");
 System.out.println("1- ingresar datos");
 System.out.println("2- calcular costo");
 System.out.println("3- ver costos");
 System.out.println("0- salir");
     inicio = scanner.nextInt();



 while (inicio !=0 ) {
    
     switch (inicio) {
        case 1:
            System.out.println(" ingrese cantidad de horas");
            horas = scanner.nextInt();


            break;
        case 2:
 
        if (horas>=5) {
            total=1500;
        }else {
            total= 500 + (horas -1)*300;
        }
        break;


        case 3:
        System.out.println("costo del estacionamiento: " + total);
        horas=0;
        break;
        default:
            System.out.println("opcion invalida");
     }
      System.out.println("bienvenido");
      System.out.println("ingresar las opciones");
       System.out.println("1- ingresar datos");
      System.out.println("2- calcular costo");
      System.out.println("3- ver costos");
     System.out.println("0- salir");
      inicio = scanner.nextInt();
    }
}
}
