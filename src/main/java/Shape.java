import processing.core.PApplet;

public abstract class Shape {
    protected float x, y;
    private float vx, vy, ax, ay;
    protected int kleur;

    public Shape(float x, float y){
        this.x = x;
        this.y = y;


    }

    public void takeStep() {
        if (!standStill()) {
            conformAccelaration();
            confurmSpeed();
        }
    }

    public void setSpeed(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void setVersnelling(float ax, float ay) {
        this.ax = ax;
        this.ay = ay;
    }
    public void stopMovement() {
        vx = vy = ax = ay = 0;
    }

    public boolean standStill() {
        return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
    }
    public void setColor(int kleur) {
        this.kleur = kleur;
    }

    private void conformAccelaration() {
        vx += ax;
        vy += ay;
    }

    private void confurmSpeed() {
        x += vx;
        y += vy;
    }


    public abstract void draw(PApplet p) ;


}
