/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

import java.util.Random;

/**
 *
 * @author RobertWladimir
 */
public class Perceptron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Valores de las Entradas
        double x1 = -1;
        double x2 = -1;
        double x3 = -1;
        
        //Valores de los Pesos aleatorios
        double w1 = new Random().nextDouble();
        double w2 = new Random().nextDouble();
        double w3 = new Random().nextDouble();
        
        Neurona n = new Neurona(x1, x2, x3, w1, w2, w3);

        System.out.println("Entrada 1 (x1): " + x1);
        System.out.println("Entrada 2 (x2): " + x2);
        System.out.println("Entrada 3 (x3): " + x3);
        System.out.println("Salida 1 (y1) = " + n.getY1());
    }
    
}
