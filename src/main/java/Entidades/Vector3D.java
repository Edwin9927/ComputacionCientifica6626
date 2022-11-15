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
public class Vector3D extends Vector{
    protected Double z0;
    
    protected Double dx;
    protected Double dy;

    protected void Axometria(){
        double alfa = (Math.PI / 4.0);
        
        this.dx = this.y0 - ((this.x0 / 2) * Math.cos(alfa));
        this.dy = this.z0 - ((this.x0 / 2) * Math.sin(alfa));
    }
    
    public Vector3D(Double x0, Double y0, Double z0, Color color) {
        super(x0, y0, color);
        this.z0 = z0;
    }

    public Vector3D() {
    }

    public Double getZ0() {
        return z0;
    }

    public void setZ0(Double z0) {
        this.z0 = z0;
    }

    @Override
    public void encender(BufferedImage canvas) {
        Axometria();
        pantalla(dx,dy);
        if (sx >= 0 & sx < 700 && sy >= 0 && sy < 500)
            canvas.setRGB(sx, sy, color.getRGB());
        
    }
    
    
    
    
    
    
    
}
