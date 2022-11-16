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
public class SuperficieV extends Vector3D{
    
    protected int tipo; //Identificacion de la superficie
    protected Double rd;

    public SuperficieV(Double x0, Double y0, Double z0, Color color, int tipo, Double rd) {
        super(x0, y0, z0, color);
        this.tipo = tipo;
        this.rd = rd;
    }

    public SuperficieV() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double getRd() {
        return rd;
    }

    public void setRd(Double rd) {
        this.rd = rd;
    }

    @Override
    public void encender(BufferedImage canvas) {
        
        Vector3D v3d = new Vector3D(0.0, 0.0, 0.0, color);
        
        double t;
        double dt = 0.1;
        
        double h;
        double dh = 0.1;
        
        switch (tipo) {
            case 1:
                t = 0.0;
                do{
                    h = 0.0;
                    do {
                        v3d.x0 = x0 + (rd * Math.cos(t));
                        v3d.y0 = y0 + (rd * Math.sin(t));
                        v3d.z0 = z0 + h;
                        v3d.encender(canvas);
                        h += dh;
                    } while (h <= 3);
                    t += dt;
                }while(t <= Math.PI * 2);
                break;
                
            case 2:
                t = - (Math.PI / 2);
                do{
                    h = 0.0;
                    do {
                        v3d.x0 = x0 + (rd * Math.cos(t) * Math.cos(h));
                        v3d.y0 = y0 + (rd * Math.cos(t) * Math.sin(h));
                        v3d.z0 = z0 + (rd * Math.sin(t));
                        v3d.encender(canvas);
                        h += dh;
                    } while (h <= Math.PI * 2);
                    t += dt;
                }while(t <= Math.PI / 2);
                break;
                
            case 3:
                t = 0.0;
                do{
                    h = 0.0;
                    dh = 0.2;
                    do {
                        v3d.x0 = x0 + (rd * (3 + Math.cos(t)) * Math.cos(h));
                        v3d.y0 = y0 + (rd * (3 + Math.cos(t)) * Math.sin(h));
                        v3d.z0 = z0 + (rd * Math.sin(t));
                        v3d.encender(canvas);
                        h += dh;
                    } while (h <= Math.PI * 2);
                    t += dt;
                }while(t <= Math.PI * 2);
                break;
            default:
                throw new AssertionError();
        }  
    }    
}
