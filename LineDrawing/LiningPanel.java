package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel {

    public LiningPanel() { }

    int counter = 0;
    double lines = 15.0;


    public Color randomColor(){
        Random random = new Random();
        float red = random.nextFloat();
        float green = random.nextFloat();
        float blue = random.nextFloat();

        return new Color(red, green, blue);
    }

    public void countingUp() {
        counter++;
        if (counter > lines)
            counter = 0;
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        for (int i = 0; i < counter; i++) {
            int w2 = (int) ((i / lines) * w);
            int h2 = (int) ((i / lines) * h);

            int difW = w - w2;
            int difH = h - h2;

            // coordinates work like (x1, y1) (x2, y2)
            g.setColor(randomColor());
            g.drawLine(0, h2, w2, h);

            g.setColor(randomColor());
            g.drawLine(w, difH, difW, 0);

            g.setColor(randomColor());
            g.drawLine(w2, h, w, difH);

            g.setColor(randomColor());
            g.drawLine(difW, 0, 0, h2);
            
        }

    }

}
