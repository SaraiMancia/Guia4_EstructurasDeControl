
package Ejemplos;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EstructuralElseAnidada {
   
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese la cantidad de su salario");
            double salario = Double.parseDouble(leer.readLine());
            ifElseAnidada(salario); 
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public static void ifElseAnidada (double salario ) {
            if(salario > 235) {
                System.out.println("Usted gana mas del salaio minimo");
            }else if(salario >0) {
                System.out.println("Usted gana menos del salario minimo");
            }else{
                System.out.println("Ingreso del datop erroneo:");
            }
        }
    
}
