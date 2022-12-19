package Entidades;

import java.awt.Color;
import javax.swing.JPanel;

public class Onda extends Vector {

    protected Double t;

    public Onda() {
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public void grafO(JPanel canvas) {
        Color[] paleta1
                = {Color.black,
                    new Color(29, 50, 88), //navy
                    Color.green,
                    new Color(1, 175, 239), //aqua
                    Color.red,
                    new Color(112, 48, 161), //purple
                    new Color(132, 60, 11),
                    Color.lightGray,
                    Color.darkGray,
                    Color.blue,
                    new Color(146, 208, 80),
                    new Color(166, 166, 166),
                    new Color(83, 129, 55),
                    new Color(176, 7, 83),
                    Color.yellow,
                    Color.white
                };
        double x, y, z;
        double w = 1.1;
        double v = 9.3;
        ModelosMatematicos modelosMat = new ModelosMatematicos();
        for (int i = 0; i < 700; i++) {
            for (int j = 0; j < 500; j++) {
                modelosMat.realXY(i, j);
                x = modelosMat.getX();
                y = modelosMat.getY();
                z = w * (Math.sqrt(x * x + y * y)) - v * t;
                z = Math.sin(z) + 1;
                int color = (int) (z * 7.5);
                Color COLOR0 = paleta1[color];
                
            }
        }
    }

}
