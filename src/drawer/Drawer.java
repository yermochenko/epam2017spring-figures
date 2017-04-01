package drawer;

import domain.Figure;

public interface Drawer<T extends Figure> {
    void draw(T figure);
}
