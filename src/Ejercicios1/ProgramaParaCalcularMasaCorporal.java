package Ejercicios1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgramaParaCalcularMasaCorporal {
      public static void main (String[] args){
      try{
            BufferedReader leer = new BufferedReader ( new InputStreamReader(System.in));
            System.out.println("Ingrese su peso (kg): ");
            double peso = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese su estatura (mts): ");
            double estatura =Double.parseDouble(leer.readLine());
            
            calcularMasaCorporal(peso, estatura);
      }catch(Exception e){
          System.out.println(e.getMessage());
        }
  }
  
  public static void calcularMasaCorporal(double peso, double estatura){
       double IMC;
       
          IMC= peso / (estatura*estatura);
           
          if (IMC<18){
               System.out.println("Peso bajo.Necesario valorar signos de desnutrición ");
            }else if (18<IMC&&IMC<=24.9 ){
                System.out.println("Peso normal");
            }else if (25<IMC&&IMC<26.9){
                System.out.println("Sobrepeso");
            }else if (27==IMC){
                System.out.println("Obesidad");
            }else if (27<IMC&&IMC<=29.9){
                System.out.println("Obesidad grado I. Riesgo relativo alto para desarrollar enfermedades cardiovasculares");
            }else if (30<IMC&&IMC<=39.9){
                System.out.println("Obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares");
            }else if (40<IMC){
                System.out.println("Obesidad grado III Extrema o Mórbida. Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares");
            }
          
          System.out.println("Su Indice de Masa Corporal es : " + IMC);
  }
}

    