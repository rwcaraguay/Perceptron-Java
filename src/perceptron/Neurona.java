/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

/**
 *
 * @author RobertWladimir
 */
public class Neurona {
    final double x1, x2, x3, w1, w2, w3;
    
    Neurona(double x1, double x2, double x3, double w1, double w2, double w3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
    }
    public double getY1() {
        double wx, y1;
        wx = (x1 * w1) + (x2 * w2) + (x3 * w3); //Función propagación
        y1 = Math.tanh(wx); //Salida
        return y1;
    }
}
