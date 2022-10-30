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
public class Margarita extends Circunferencia {

    public Margarita(Double x0, Double y0, Color color) {
        super(x0, y0, color);
    }

    public Margarita() {
    }

    @Override
    public void encender(BufferedImage canvas) {

        double t = 0.0;
        double dt = 0.001;

        Vector v = new Vector(x0, y0, color);

        do {
            v.x0 = x0 + Math.cos(4 * t) * radio * Math.cos(t);
            v.y0 = y0 + Math.cos(4 * t) * radio * Math.sin(t);
            v.encender(canvas);
            t += dt;

        } while (t <= 2 * Math.PI);

    }

}
