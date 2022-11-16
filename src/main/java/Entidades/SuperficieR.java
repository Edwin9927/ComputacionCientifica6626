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
public class SuperficieR extends Vector3D {
    
    protected int tipo;
    protected Double fv; //factor de visualizacion

    public SuperficieR(int tipo, Double fv, Double x0, Double y0, Double z0, Color color) {
        super(x0, y0, z0, color);
        this.tipo = tipo;
        this.fv = fv;
    }
    
    public SuperficieR() {
    }
    
    public int getTipo() {
        return tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public Double getFv() {
        return fv;
    }
    
    public void setFv(Double fv) {
        this.fv = fv;
    }
    
    @Override
    public void encender(BufferedImage canvas) {
        double x1 = -5.0;
        double dx = 0.1;
        
        Vector3D v3d = new Vector3D();
        
        switch (tipo) {
            case 1:
                do {
                    double y1 = -3.5;
                    double dy = 0.1;
                    do {                        
                        v3d.x0 = x1;
                        v3d.y0 = y1;
                        v3d.z0 = (fv * (Math.pow(x1, 2) + Math.pow(y1, 2))) - 4.5;
                        v3d.encender(canvas);
                        y1 += dy;
                    } while (y1 <= 3.5);
                    x1 += dx;
                } while (x1 <= 5);
                
                break;
            default:
                throw new AssertionError();
        }
    }    
    
}
