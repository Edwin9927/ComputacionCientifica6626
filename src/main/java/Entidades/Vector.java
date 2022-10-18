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
public class Vector extends ModelosMatematicos{
    
    protected Double x0;
    protected Double y0;
    protected Color color;
    
    public Vector (Double x0, Double y0, Color color) {
        this.x0 = x0;
        this. y0 = y0;
        this. color = color;
    }
    
    public Vector() {
        this.x0 = 0.0;
        this.y0 = 0.0;
        this. color = Color.BLACK;
    }

    public Double getX0() {
        return x0;
    }

    public void setX0(Double x0) {
        this.x0 = x0;
    }

    public Double getY0() {
        return y0;
    }

    public void setY0(Double y0) {
        this.y0 = y0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void encender (BufferedImage canvas){
        pantalla(x0,y0);
        if (sx >= 0 & sx < 700 && sy >= 0 && sy < 500)
            canvas.setRGB(sx, sy, color.getRGB());
    }
    
}