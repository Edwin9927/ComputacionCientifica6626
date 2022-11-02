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
        double limi = Math.PI * 15;
        //double limi = 360;
        
        Vector v = new Vector(x0,y0, color);
        
        do{
            v.x0 = this.x0 + ((radio - radio2) * Math.cos(t)) + (radio2 * Math.cos(t * (1 + (radio/radio2))));
            v.y0 = this.y0 + ((radio - radio2) * Math.sin(t)) + (radio2 * Math.sin(t * (1 + (radio/radio2))));
            int r = (int) Util.interpolar2Puntos(v.x0, -radio, 255.0, radio, 0.0);
            int g = (int) Util.interpolar2Puntos(v.x0, -radio, 255.0, radio, 0.0);
            int b = (int) Util.interpolar2Puntos(v.x0, -radio, 0.0, radio, 255.0);
            Color color = new Color (r, g, b);
            v.color = color;
            v.encender(canvas);
            t += dt;
        }while(t <= limi);
    }
    
}
