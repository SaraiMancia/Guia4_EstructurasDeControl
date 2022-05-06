
package Ejercicios1;

import java.util.Scanner;


public class Rcalculador {
   
    
    public String bandera (int opcion) {
        String operacion="";
        switch (opcion) {
            case 1:
                operacion = "sumar";
                break;
            case 2:
                operacion = "restar";
                break;
            case 3:
                operacion = "multiplicar";
                break;
            case 4:
                operacion = "dividir";
                break;
            default:
                break;
        }
        return operacion;
    
    }
    public static void main (String [] asrg) {
        Rcalculador cal = new Rcalculador();
        
        Scanner leer = new Scanner (System.in);
        
        calculador objeto = new calculador();
        
        //1
        
        
        System.out.println("Ingrese 1 si desea Sumar, 2 si desea Restar, 3 si desea Multiplicar y 4 si desea Dividir");
        int opcion = Integer.parseInt(leer.nextLine());
        
        System.out.println("Ingrese la primera cantidad");
        objeto.setCan1(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese la segunda cantidad ");
        objeto.setCan2(Double.parseDouble(leer.nextLine()));
        
        System.out.println("El resultado de la suma es: " +objeto.suma());
         System.out.println("Selecciono Sumar: " +cal.bandera(opcion));
        System.out.println("El resultado de la resta es: " +objeto.resta());
         System.out.println("Selecciono Restar: " +cal.bandera(opcion));
        System.out.println("El resultado de la multiplicacio  es: " +objeto.multiplicacion());
         System.out.println("Seleccio Multiplicar: " +cal.bandera(opcion));
        System.out.println("El resultado de la divivion es: " +objeto.divicion());
         System.out.println("Seleccion Dividir: " +cal.bandera(opcion));
        
        
    
}
}
