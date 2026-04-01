import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Integer horas=25;
        Integer valorHoraExtra=35;
        
        
        Integer totalSueldo;
        Integer suma;
       Integer bonoConSueldo;
       

    System.out.print("ingrese su sueldo: ");
       totalSueldo = scanner.nextInt();
       System.out.println("trabajo horas extra?");
       Boolean extra= scanner. nextBoolean();
    System.out.print( "tiene bono?");
      boolean bono= scanner.nextBoolean();
     if (extra==true) {
        System.out.println("Indicar la cant. de horas");
        horas = scanner.nextInt();
        
        totalSueldo= (valorHoraExtra*horas);
     
     
      if (bono==true) {
        System.out.println("Indicar la cantidad de bono");
        suma = scanner.nextInt();
        bonoConSueldo= suma+totalSueldo;
        System.out.println("El total mas el bono es: "+bonoConSueldo);
     }
        
    
    
}
}
}