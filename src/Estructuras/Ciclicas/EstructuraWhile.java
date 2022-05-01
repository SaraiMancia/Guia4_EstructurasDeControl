
package Estructuras.Ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraWhile {
    public static void main(String[] args) {
        try{
            BufferedReader leer= new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresarun número límite de repetición:");
            String limite=leer.readLine();
            if(limite==null){
                System.out.println("Dato inválido");
            }else{
                instruccionWhileSencillo(Integer.parseInt(limite));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void  instruccionWhileSencillo (int valorLimite) {
        int i=1;
        while(i<=valorLimite){
            System.out.println("El valor de la repetición es: "+i);
            i++;
        }
        
    }
}
