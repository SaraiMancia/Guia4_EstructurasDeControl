package Ejemplos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EstructuraSwitchint {
    public static void main(String[] args){
       try{
           BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
           System.out.println("Ingrese un numero netre 1 y 5:" );
           int  numero = Integer.parseInt(leer.readLine());
           swichtInt(numero);
       }catch(Exception e){
           System.out.println(e.getMessage());  
       }
    }
    
    public static void swichtInt(int numero){
        String nombreDelNumero;
        switch(numero){
        case 1:
        nombreDelNumero  = "UNO";
        break;
        case 2:
        nombreDelNumero  = "DOS";
        break;
        case 3:
        nombreDelNumero  = "TRES";
        break;
        case 4:
        nombreDelNumero  = "CUATRO";
        break;
        case 5:
        nombreDelNumero  = "CINCO";
        break;
        default:
            nombreDelNumero ="Numero no valido!";
        }
        System.out.println("El numero Ingresado es: " +nombreDelNumero);
        
    }
    
}


