package drawer;

import domain.Circle;

public class CircleDrawer implements Drawer<Circle> {
    @Override
    public void draw(Circle circle) {
        System.out.println("circle: center (" + circle.getX() + "; " + circle.getY() + "), radius " + circle.getRadius());
    }
}
