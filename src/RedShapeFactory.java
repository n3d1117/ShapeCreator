public class RedShapeFactory implements ShapeFactory {

    private static RedShapeFactory INSTANCE = null;

    public static RedShapeFactory getInstance() {
        if (INSTANCE == null)
            INSTANCE = new RedShapeFactory();
        return INSTANCE;
    }

    private RedShapeFactory() { }

    @Override
    public Circle createCircle() {
        return new RedCircle();
    }

    @Override
    public Square createSquare() {
        return new RedSquare();
    }
}
