package Entidades;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author edwinmanzano
 */
public class Hipocicloide extends Circunferencia{
    
    protected double radio2;

    public Hipocicloide(Double x0, Double y0, Color color) {
        super(x0, y0, color);
    }

    public Hipocicloide() {
    }

    public double getRadio2() {
        return radio2;
    }

    public void setRadio2(double radio2) {
        this.radio2 = radio2;
    }

    @Override
    public void encender(BufferedImage canvas) {
        double t = 0.0;
        double dt = 0.001;
        
        Vector v = new Vector(x0,y0, color);
        
        do{
            v.x0 = this.x0 + ((radio - radio2) * Math.cos(t)) + (radio2 * Math.cos(t * (1-(radio/radio2))));
            v.y0 = this.y0 + ((radio - radio2) * Math.sin(t)) + (radio2 * Math.sin(t * (1-(radio/radio2))));
            v.encender(canvas);
            t+=dt;
        } while(t <= 2 * Math.PI);
    }
}
