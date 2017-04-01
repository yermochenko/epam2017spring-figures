package drawer;

import domain.Rectangle;

public class RectangleDrawer implements Drawer<Rectangle> {
    @Override
    public void draw(Rectangle rectangle) {
        System.out.println("rectangle: center (" + rectangle.getX() + "; " + rectangle.getY() + "), width " + rectangle.getWidth() + ", height " + rectangle.getHeight());
    }
}
