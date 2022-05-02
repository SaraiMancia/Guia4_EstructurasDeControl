
package Estructuras.Ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraFor {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader  (new InputStreamReader (System.in));
            System.out.println("ingresar un número limite de repetición:");
            String limite = leer.readLine();
            //casting o conversión de datos al momento de envio
            intruccionFor(Integer.parseInt(limite));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
            public static void intruccionFor(int valorLimite) {
                
                for(int i = 1; i <=valorLimite; i++) {
                    System.out.println("El valor de la repetición es: " + i );
                    
                }
            }
        }
        
    
