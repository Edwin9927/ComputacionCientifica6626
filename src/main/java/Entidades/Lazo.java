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
public class Lazo extends Circunferencia{

    public Lazo() {
    
    }
    
    public Lazo(Double x0, Double y0, Color color) {
        
        super(x0, y0, color);
    
    }

    @Override
    public void encender(BufferedImage canvas) {
        
        double t = 0.0;
        double dt = 0.001;

        Vector v = new Vector(x0, y0, color);      
        
        do{
            v.x0 = x0 + Math.sin(2 * t) * radio;
            v.y0 = y0 + Math.cos(3 * t) * radio;
            v. encender (canvas);
            t += dt;
            
        }while(t <= 2*Math.PI);
                
    }
    
    public void encenderinterpolado(BufferedImage canvas) {
        
        double t = 0.0;
        double dt = 0.001;

        Vector v = new Vector(x0, y0, color);
        
        double limI = v.x0 - radio;
        double limS = v.x0 + radio;        
        
        do{
            v.x0 = x0 + Math.sin(2 * t) * radio;
            v.y0 = y0 + Math.cos(3 * t) * radio;
            
            int r = (int) Util.interpolar2Puntos(v.x0, limI, 255.0, limS, 0.0);
            int g = (int) Util.interpolar2Puntos(v.x0, limI, 255.0, limS, 0.0);
            int b = (int) Util.interpolar2Puntos(v.x0, limI, 0.0, limS, 255.0);
            Color color = new Color (r, g, b);
            v.color = color;
            
            System.out.println("x = "+v.x0);
            v. encender (canvas);
            t += dt;
            
        }while(t <= 2*Math.PI);
                
    }
    
}