package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import domain.Circle;
import domain.Figure;
import domain.Rectangle;
import drawer.CircleDrawer;
import drawer.Drawer;
import drawer.RectangleDrawer;

public class Runner {
    private static Map<Class<? extends Figure>, Drawer<?>> drawers = new HashMap<>();

    static {
        drawers.put(Circle.class, new CircleDrawer());
        drawers.put(Rectangle.class, new RectangleDrawer());
    }

    @SuppressWarnings("unchecked")
    public static <T extends Figure> Drawer<T> create(Class<T> c) {
        return (Drawer<T>)drawers.get(c);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Figure figures[] = new Figure[random.nextInt(10) + 1];
        for(int i = 0; i < figures.length; i++) {
            figures[i] = FigureGenerator.create();
        }
        for(Figure figure : figures) {
            @SuppressWarnings("unchecked")
            Class<Figure> c = (Class<Figure>)figure.getClass();
            create(c).draw(figure);
        }
    }

}
