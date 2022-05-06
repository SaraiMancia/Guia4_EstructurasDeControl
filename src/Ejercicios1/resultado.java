
package Ejercicios1;

import java.util.Scanner;


public class resultado {
    
    public static void main(String [] asrg ) {
        Scanner leer =  new Scanner(System.in);
        //DepreciacionMaquinaria  r= new DepreciacionMaquinaria ();
        DepreciacionMaquinaria objeto = new DepreciacionMaquinaria();
        
        System.out.println("Ingrese el costo de la maquinaria");
        objeto.setCostoM(leer.nextDouble());
        System.out.println("Ingrese el nombre de la Maquinaria");
        objeto.setNombreM(leer.next());
        System.out.println("Ingrese el periodo de tiempo en el cual sera depreciada");
        objeto.setTiempoD(leer.nextDouble());
        
        
        System.out.println("El precio de la depreciacion es de: "+ objeto.formula());
       
        
        
    }
    
}
