/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author edwinmanzano
 */
public class Util {
    /**
     * 
     * Funcion para interpolar dos puntos 
     * 
     * @param x - Valor calculado de la interpolacion
     * @param x1 - 
     * @param y1
     * @param x2
     * @param y2
     * @return 
     */
    public static double interpolar2Puntos (double x, 
            double x1, double y1, 
            double x2, double y2) {
        return ((y1 * ((x - x2) / (x1 - x2))) + 
                (y2 * ((x - x1) / (x2 - x1))));
    }
    
    /**
     * Funcion para interpolar 3 puntos
     * @param x Iterador
     * @param x1 
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @return f(x) 
     */
    public static double interpolar3Puntos (double x, 
            double x1, double y1, 
            double x2, double y2, 
            double x3, double y3) {
        return ((y1 * (((x - x2)*(x - x3)) / ((x1 - x2) * (x1 -x3)))) + 
                (y2 * (((x - x1)*(x - x3)) / ((x2 - x1) * (x2 -x3)))) + 
                (y3 * (((x - x1)*(x - x2)) / ((x3 - x1) * (x3 -x2)))));
    }
    
    public static double dxInterpolar3Puntos(double x, 
            double x1, double y1, 
            double x2, double y2, 
            double x3, double y3){        
        return (((y1 / ((x1 - x2) * (x1 -x3))) * ((2 * x) - x2 -x3)) +
                ((y2 / ((x2 - x1) * (x2 -x3))) * ((2 * x) - x1 -x3)) +
                ((y3 / ((x3 - x1) * (x3 -x2))) * ((2 * x) - x1 -x2)));
    }
    
}
