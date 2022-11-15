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
public class Mariposa extends Vector {

    public Mariposa(Double x0, Double y0, Color color) {
        super(x0, y0, color);
    }

    public Mariposa() {
    }

    @Override
    public void encender(BufferedImage canvas) {
        double t = 0.0;
        double dt = 0.001;
        double limi = Math.PI * 12;

        Vector v = new Vector(x0, y0, color);

        do {
            v.x0 = this.x0 + (Math.sin(t) * 
                    ((Math.pow(Math.E, Math.cos(t))) - 
                    (2 * (Math.cos(4 * t))) - 
                    (Math.pow(Math.sin(t / 12), 5))));
            v.y0 = this.y0 + (Math.cos(t) * 
                    ((Math.pow(Math.E, Math.cos(t))) - 
                    (2 * (Math.cos(4 * t))) - 
                    (Math.pow(Math.sin(t / 12), 5))));
            v.encender(canvas);
            t += dt;
        } while (t <= limi);
    }

}
