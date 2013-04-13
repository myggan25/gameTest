package gameTest;


import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Robin
 * Date: 4/13/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player extends GameObject{

    public Player(Point p, Dimension d) {
        super(p, d);
    }

    public Player(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
}