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
public class Segmento3D extends Vector3D{
    protected  Double xf;
    protected  Double yf;
    protected  Double zf;

    public Segmento3D(Double xf, Double yf, Double zf, Double x0, Double y0, Double z0, Color color) {
        super(x0, y0, z0, color);
        this.xf = xf;
        this.yf = yf;
        this.zf = zf;
    }

    public Segmento3D() {
        
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

    public Double getZf() {
        return zf;
    }

    public void setZf(Double zf) {
        this.zf = zf;
    }

    @Override
    public void encender(BufferedImage canvas) {
        double t = 0.0;
        double dt = 0.001;
        
        Vector3D v3d = new Vector3D(x0, y0, z0, color);
        
        do{
            v3d.x0 = this.x0 + ((this.xf - this.x0)*t);
            v3d.y0 = this.y0 + ((this.yf - this.y0)*t);
            v3d.z0 = this.z0 + ((this.zf - this.z0)*t);
            /*int r = (int) Util.interpolar2Puntos(t, 0.0, 255.0, 1.0, 0.0);
            int g = (int) Util.interpolar2Puntos(t, 0.0, 0.0, 1.0, 0.0);
            int b = (int) Util.interpolar2Puntos(t, 0.0, 0.0, 1.0, 255.0);
            Color color = new Color (r, g, b);
            v3d.color = color;*/
            v3d.encender(canvas);
            t+=dt;
        }while(t<=1.0);
    }
    
    public void encenderP2(BufferedImage canvas) {
        double t = 0.0;
        double dt = 0.005;
        
        Vector3D v3d = new Vector3D(x0, y0, z0, color);
        
        do{
            v3d.x0 = this.x0 + ((this.xf - this.x0)*t);
            v3d.y0 = this.y0 + ((this.yf - this.y0)*t);
            v3d.z0 = this.z0 + ((this.zf - this.z0)*t);
            /*int r = (int) Util.interpolar2Puntos(t, 0.0, 255.0, 1.0, 0.0);
            int g = (int) Util.interpolar2Puntos(t, 0.0, 0.0, 1.0, 0.0);
            int b = (int) Util.interpolar2Puntos(t, 0.0, 0.0, 1.0, 255.0);
            Color color = new Color (r, g, b);
            v3d.color = color;*/
            v3d.setColor(Color.GRAY);
            v3d.encender(canvas);
            t+=dt;
        }while(t<=1.0);
    }
    
    
}
