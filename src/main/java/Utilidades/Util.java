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
    public static double interpolar2Puntos (double x, double x1, double y1, double x2, double y2) {
        return ((y1 * ((x - x2) / (x1 - x2))) + (y2 * ((x - x1) / (x2 - x1))));
    }
    
}
