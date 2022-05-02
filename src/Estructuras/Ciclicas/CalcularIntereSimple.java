
package Estructuras.Ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcularIntereSimple {
    public static void main(String[] args) {
        try{
             BufferedReader leer= new BufferedReader (new InputStreamReader(System.in));
             System.out.println("Ingresar la siguiente información: ");
             System.out.println("Cantidad de dinero depositada:");
             double cantidad= Double.parseDouble(leer.readLine());
             System.out.println("Cantidad de años del deposito: ");
             int anhios= Integer.parseInt(leer.readLine());
             System.out.println("Interes anual por el deposito: ");
             double interes= Double.parseDouble(leer.readLine());
             System.out.println("--------------------------------------");
             intereSimple(cantidad,anhios,interes);
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    public static void intereSimple(double cantidad, int anhios,double interes) {
        for(int i=1; i<=anhios; i++){
            double interesPorAnhio= cantidad*(interes/100);
            cantidad+= cantidad*(interes/100);
            System.out.println("Cantidad interes en el año "+i+";"+interesPorAnhio);
            System.out.println("Monto interes mas dinero: "+cantidad);
            System.out.println("-----------------------------------");
        }
        
    }
    
}
