/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author edwinmanzano
 */
public class Circunferencia extends Vector{
    protected double radio;

    public Circunferencia(Double x0, Double y0, Color color) {
        super(x0, y0, color);
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void encender(BufferedImage canvas) {
        double t = 0.0;
        double dt = 0.001;
        
        Vector v = new Vector(x0,y0, color);
        
        do{
            v.x0 = this.x0 + (radio * Math.cos(t));
            v.y0 = this.y0 + (radio * Math.sin(t));
            v.encender(canvas);
            t+=dt;
        }while(t<= 2 * Math.PI);
    }
}
