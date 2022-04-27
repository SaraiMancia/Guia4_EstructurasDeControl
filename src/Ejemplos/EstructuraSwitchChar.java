
package Ejemplos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {
    public static void main(String[] args) {
        try{//Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            System.out.println("Ingresar el estado civil de la persona:");
            String estadoCivil = leer.readLine(); //Datos tipo String 
            //toUpperCase combierte el contenido a mayúscula y cahrAt extrae el caracter de la posicion de o
            switchChar(estadoCivil.toUpperCase().charAt(0));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
        public static void switchChar (char estadoCivil){ //Método para el switch
            String mensajeEstadoCivil;
            switch(estadoCivil){ //Valor o caracter a evaluar
                case 'S': //En el caso que eñ  valor sea "S"
                    mensajeEstadoCivil = "Soltero/a";
                    break; //Detiene el proceso si era el valor ingresado
                case 'C': //En el caso que el valor sea "C" y asi sucesivamente
                    mensajeEstadoCivil = "Casado/a";
                    break;
                case 'D':
                    mensajeEstadoCivil = "Divorsiado/a";
                    break;
                case 'A':
                    mensajeEstadoCivil = "Forever Alone";
                    break;
                default: // Si no se cumple ninguno de las anteriores
                    mensajeEstadoCivil = "Estado civil erroneo!";
            }
            System.out.println("Su estado civil es: " + mensajeEstadoCivil);
        }
        
        
                    
                    
            }
        
        
    
    

