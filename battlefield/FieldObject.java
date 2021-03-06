package lesson6.gametank.gametankwithpackages.battlefield;


import lesson6.gametank.gametankwithpackages.behavior.*;

import java.awt.*;

public class FieldObject implements Drawable, Destroyable{

    protected int x;
    protected int y;

    public FieldObject(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void draw(Graphics g) {

    }
}
