/**
 * Created by Nick on 23/08/2017.
 */

import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet{
    Shape top,left,right,goal;

    public static void main(String[] args) {

        PApplet.main(new String[] {"Main"});
    }
    public void draw(){

    }
    public void setup(){
        size (500,500);
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
