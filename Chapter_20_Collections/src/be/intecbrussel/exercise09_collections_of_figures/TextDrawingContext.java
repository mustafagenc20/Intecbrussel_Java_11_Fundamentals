package be.intecbrussel.exercise09_collections_of_figures;

public class TextDrawingContext implements DrawingContext {

    @Override
    public void draw(Rectangle rectangle) {
        System.out.println(rectangle);
    }

    @Override
    public void draw(Circle circle) {
        System.out.println(circle);
    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println(triangle);
    }
}