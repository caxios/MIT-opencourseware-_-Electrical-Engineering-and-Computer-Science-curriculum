package assignment5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    int i = 1;
    int j = 0;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<BouncingBox>();
        box1 = new BouncingBox(50,50,Color.BLACK);
        box2 = new BouncingBox(1,1,Color.RED);
        box3 = new BouncingBox(30,50,Color.BLUE);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        for(BouncingBox box : boxes) {
        	i *= -1;
        	j += 1;
        	box.setMovementVector(i, j);
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        // surface.drawLine(50, 50, 250, 250);
        box1.draw(surface);
        box2.draw(surface);
        box3.draw(surface);
    }
} 
