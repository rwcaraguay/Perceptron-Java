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
public class ProcesoPerceptron {
    private double[] pesos;
    private double[] resultadoEsperado;
    private double[][] entradas;
    private int numeroEntradas;
    private static final double TASA_APRENDIZAJE = 0.5d;
    
    public double[][] getEntradas() {
        return entradas;
    } 
    public void setEntradas(double[][] entradas) {
        this.entradas = entradas;
        this.numeroEntradas = entradas[0].length;
    } 
    public double[] getresultadoEsperado() {
        return resultadoEsperado;
    } 
    public void setresultadoEsperado(double[] resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    } 
    public double[] getPesos() {
        return pesos;
    } 
    public void setPesos(double[] pesos) {
        this.pesos = pesos;
    }
    public void iniciarPesos() {
        pesos = new double[numeroEntradas];
        for (int i = 0; i < numeroEntradas; i++) {
            pesos[i] = Math.random();
        }
    }
    public void presentarPesos() {
        for (int i = 0; i < numeroEntradas; i++) {
            System.out.println("W[" + i + "] = " + pesos[i]);
        }
    } 
    public void recalcularPesos(int posicionEntrada, double y) {
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = pesos[i] + TASA_APRENDIZAJE * (resultadoEsperado[posicionEntrada] - y) * entradas[posicionEntrada][i];
        }
    }
    public void entrenarPerceptron() {
        int cont = 0;
        double resultado = 0;
        while (cont < entradas.length) {
            double suma = 0;
            for (int i = 0; i < numeroEntradas; i++) {
                suma += (pesos[i] * entradas[cont][i]);//&#8721; x[i] * W[i] 
            }
            resultado = suma >= 0 ? 1 : -1;
            if (resultado == resultadoEsperado[cont]) {
                //Resultado Correcto
                for (int i = 0; i < numeroEntradas; i++) {
                    System.out.println("Entrada: "+entradas[cont][i]);
                }
                System.out.println("RESULTADO ESPERADO = " + resultadoEsperado[cont] + ", RESULTADO CALCULADO POR EL SOFT. = " + resultado + " CORRECTOS");
                System.out.println("");
            } else {
                //Resultado Incorrecto
                for (int i = 0; i < numeroEntradas; i++) {
                    
                    System.out.println("Entrada: "+entradas[cont][i]);
                }
                System.out.println("");
                System.out.println("RESULTADO ESPERADO = " + resultadoEsperado[cont] + ", RESULTADO CALCULADO POR EL SOFT. = " + resultado + " RESULTADOS NO COINCIDEN =>ERROR");
                System.out.println("Se realiza la Corrección de pesos");
                recalcularPesos(cont, resultado);
                presentarPesos();
                System.out.println("");
                System.out.println("----VOLVIENDO A CALCULAR PESOS----");
                cont = -1;
            }
            cont++;
        }
    }
}