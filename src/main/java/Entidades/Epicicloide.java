/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Utilidades.Util;
import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author edwinmanzano
 */
public class Epicicloide extends Circunferencia{
    
    protected double radio2;

    public Epicicloide(Double x0, Double y0, Color color) {
        super(x0, y0, color);
    }

    public Epicicloide() {
    }

    public double getRadio2() {
        return radio2;
    }

    public void setRadio2(double radio2) {
        this.radio2 = radio2;
    }

    @Override
    public void encender(BufferedImage canvas) {
        double t = 0.0;
        double dt = 0.001;
        double limi = Math.PI * 30;
        double radio1y2 = 2 * (radio + radio2);
        double nradio1y2 = (-1) * radio1y2; 
        
        Vector v = new Vector(x0, y0, color);
        
        do{
            v.x0 = this.x0 + ((radio + radio2) * Math.cos(t)) + (radio2 * Math.cos(t * (1 + (radio/radio2))));
            v.y0 = this.y0 + ((radio + radio2) * Math.sin(t)) + (radio2 * Math.sin(t * (1 + (radio/radio2))));
            int r = (int) Util.interpolar2Puntos(v.x0, nradio1y2, 255.0, radio1y2, 0.0);
            int g = (int) Util.interpolar2Puntos(v.x0, nradio1y2, 255.0, radio1y2, 0.0);
            int b = (int) Util.interpolar2Puntos(v.x0, nradio1y2, 0.0, radio1y2, 255.0);
            Color color = new Color (r, g, b);
            System.out.println("x0 = "+ v.x0);
            System.out.println("y0 = "+ v.y0);
            v.color = color;
            v.encender(canvas);
            t += dt;
        }while(t <= limi);
    }
    
}
