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
    public static double interpolar2Puntos (double x, double x1, double y1, double x2, double y2) {
        return ((y1 * ((x - x2) / (x1 - x2))) + (y2 * ((x - x1) / (x2 - x1))));
    }
    
}
