
package Ejercicios1;


public class calculador {
    double can1;
     double can2;
    

    public calculador() {
    }

    public calculador(double can1, double can2, double suma, double resta, double multiplicacion, double divicion) {
        this.can1 = can1;
        this.can2 = can2;
        
    }

    public double getCan1() {
        return can1;
    }

    public void setCan1(double can1) {
        this.can1 = can1;
    }

    public double getCan2() {
        return can2;
    }

    public void setCan2(double can2) {
        this.can2 = can2;
    }

    
    //SUMA
    public double suma() {
        double Suma;
        Suma=(this.can1 + this.can2);
        return Suma;
        
  
}
    //RESTA
    public  double resta() {
        double Resta;
        Resta = (this.can1 - this.can2);
        return Resta;
    }
    //Multiplicacion
    public  double multiplicacion() {
        double Multi;
        Multi = (this.can1 * this.can2);
        return Multi;
    }
    //Divicion
    public double divicion() {
        double Divicion;
        Divicion = (this.can1 / this.can2);
        return Divicion;
    }
    
}

