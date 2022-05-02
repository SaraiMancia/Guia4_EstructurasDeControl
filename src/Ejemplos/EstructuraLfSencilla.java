package Ejemplos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraLfSencilla {
     public static void main(String[] args){
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
                    System.out.println("Ingrese la cantidad de su salario: ");
                    double salario =Double.parseDouble(leer.readLine());
                    ifSencillo(salario);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void ifSencillo(double salario){
        if(salario < 235){
            System.out.println("usted gana mas del salario minimo");
        }
    }
    
}
