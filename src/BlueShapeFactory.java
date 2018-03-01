class BlueShapeFactory implements ShapeFactory {

    private static BlueShapeFactory INSTANCE = null;

    public static BlueShapeFactory getInstance() {
        if (INSTANCE == null)
            INSTANCE = new BlueShapeFactory();
        return INSTANCE;
    }

    private BlueShapeFactory() { }

    @Override
    public Circle createCircle() {
        return new BlueCircle();
    }

    @Override
    public Square createSquare() {
        return new BlueSquare();
    }
}
