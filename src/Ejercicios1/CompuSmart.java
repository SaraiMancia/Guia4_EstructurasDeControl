
package Ejercicios1;

import java.util.Scanner;

public class CompuSmart {
    
    public static void main (String[] args) {
       try {
            double valorV;
            Scanner leer = new Scanner (System.in);
            System.out.println("Ingrese el valor de la venta: ");
            
            valorV= leer.nextDouble();
            CalcularcComision(valorV);
            }catch (Exception e){
             System.out.println(e.getMessage());
         }
                   
        }
    public static void CalcularcComision(double valorV) {
        double comision,salario=300,salarioL,Renta,salarioT=0.0;
        if(valorV >=3000){
            comision=salario*10/100;
            salarioL=salario+comision;
            Renta=salarioL*10/100;
            salarioT=salarioL-Renta;
        }else if(1000 >valorV || valorV<= 2999){
            comision=salario*8/100;
            salarioL=salario+comision;
            Renta=salarioL*10/100;
            salarioT=salarioL-Renta; 
        }
        else if(1 >valorV || valorV<= 999){
            comision=salario*5/100;
            salarioL=salario+comision;
            Renta=salarioL*10/100;
            salarioT=salarioL-Renta;
        }
       System.out.println("Salario total del vendedor es: $" + salarioT);
    }
}
    
    