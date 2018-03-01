public class GreenShapeFactory implements ShapeFactory {

    private static GreenShapeFactory INSTANCE = null;

    public static GreenShapeFactory getInstance() {
        if (INSTANCE == null)
            INSTANCE = new GreenShapeFactory();
        return INSTANCE;
    }

    private GreenShapeFactory() { }

    @Override
    public Circle createCircle() {
        return new GreenCircle();
    }

    @Override
    public Square createSquare() {
        return new GreenSquare();
    }
}
