import processing.core.PApplet;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;

public class Main extends PApplet{
    private Shape top,left,right,goal,circle;
    int x,y;

    public static void main(String[] args) {

        PApplet.main(new String[] {"Main"});
    }
    public void draw(){

        circle.takeStep();


    }
    public void setup(){
        size (500,500);
        makeObstacles();

        circle = new Circle(250,400,20,20);
        circle.setColor(20);
        circle.draw(this);
        circle.setSpeed(10,5);
        circle.setAcceleration(10,5);


    }

    private void makeObstacles() {
        goal = new Rectangle(225,50,50,50);
        top = new Rectangle ( 150,150,200,10);
        left = new Rectangle ( 50,300,100,10);
        right = new Rectangle ( 350,300,100,10);

        ArrayList<Shape> lines = new ArrayList<Shape>();
        lines.add(top);lines.add(left);lines.add(right);lines.add(goal);
        goal.setColor(20);

        for(Shape s: lines  ){
            s.draw(this);
        }
    }
}
