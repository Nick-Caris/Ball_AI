package shapes;

import processing.core.PApplet;

public class Rectangle extends Shape {


    private float breedte, height;

    public Rectangle(float x, float y, float width, float height) {
        super( x ,  y);
        this.breedte = width;
        this.height = height;
        stopMovement();
        color = 0xFFFFFFFF;
    }


    public void draw(PApplet p) {
        p.noStroke();
        p.fill(color);
        p.rect(x, y, breedte, height);
    }



}
