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
public class Segmento extends Vector{
    protected Double xf;
    protected Double yf;

    public Segmento(Double x0, Double y0, Color color) {
        super(x0, y0, color);
    }

    public Segmento() {
    }

    public Double getXf() {
        return xf;
    }

    public void setXf(Double xf) {
        this.xf = xf;
    }

    public Double getYf() {
        return yf;
    }

    public void setYf(Double yf) {
        this.yf = yf;
    }
    
    
    @Override
    public void encender (BufferedImage canvas){
        double t = 0.0;
        double dt = 0.001;
        
        Vector v = new Vector(x0,y0, color);
        
        do{
            v.x0 = this.x0 + ((this.xf - this.x0)*t);
            v.y0 = this.y0 + ((this.yf - this.y0)*t);
            /*int r = (int) Util.interpolar2Puntos(t, 0.0, 255.0, 1.0, 0.0);
            int g = (int) Util.interpolar2Puntos(t, 0.0, 0.0, 1.0, 0.0);
            int b = (int) Util.interpolar2Puntos(t, 0.0, 0.0, 1.0, 255.0);
            Color color = new Color (r, g, b);
            v.color = color;*/
            v.encender(canvas);
            t+=dt;
        }while(t<=1.0);
    }
    
}
