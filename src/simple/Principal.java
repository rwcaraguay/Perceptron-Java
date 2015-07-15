/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

/**
 *
 * @author robert
 */
public class Principal {    
    public static void main(String[] args) {
        ProcesoPerceptron p = new ProcesoPerceptron();
        //Salidas esperadas
        double[] resultadoEsperado = {1, 1, 1, -1};
        //Entradas
        //x1, x2, &#952;
        double[][] entradas = {{1, 1, -1},{1, -1, -1},
                               {-1, 1, -1},{-1, -1, -1}};
        p.setEntradas(entradas);
        p.setresultadoEsperado(resultadoEsperado);
        p.iniciarPesos();
        p.entrenarPerceptron();
        System.out.println("");
        System.out.println("PESOS CORRECTOS:");
        p.presentarPesos();
    }   
}
