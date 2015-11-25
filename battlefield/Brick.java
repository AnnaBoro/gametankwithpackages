package lesson6.gametank.gametankwithpackages.battlefield;

import java.awt.*;


public class Brick  extends FieldObject{

    public Brick(int y, int x) {
        super(y, x);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(0, 0, 255));
        g.fillRect(x * 64, y * 64, 64, 64);
    }

}