package test;

import java.util.Random;

import domain.Circle;
import domain.Figure;
import domain.Rectangle;

public class FigureGenerator {
    public static Figure create() {
        Random random = new Random();
        Figure figure = null;
        switch(random.nextInt(2)) {
        case 0:
            Circle circle = new Circle();
            circle.setRadius(random.nextDouble() * 200 - 100);
            figure = circle;
            break;
        case 1:
            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(random.nextDouble() * 200 - 100);
            rectangle.setHeight(random.nextDouble() * 200 - 100);
            figure = rectangle;
            break;
        }
        figure.setX(random.nextDouble() * 200 - 100);
        figure.setY(random.nextDouble() * 200 - 100);
        return figure;
    }
}
