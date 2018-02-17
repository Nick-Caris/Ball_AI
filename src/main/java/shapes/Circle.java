package shapes;

import processing.core.PApplet;

public class Circle extends Shape {

    private float width, height;

    public Circle(float x, float y, float width, float height) {
        super( x ,  y);
        this.width = width;
        this.height = height;
        stopMovement();
        color = 0xFFFFFFFF;
    }


    public void draw(PApplet p) {
        p.noStroke();
        p.fill(color);
        p.ellipse(x,y,width,height);
    }



}
