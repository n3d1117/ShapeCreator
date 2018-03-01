public class Main {

    public static void main(String[] args) {
        ColorChooser colorChooser = new ColorChooser();
        FactoryChooser chooser = new FactoryChooser(colorChooser);

        colorChooser.setColor(Color.green);

        Shape circle = chooser.getFactory().createCircle();
        Shape square = chooser.getFactory().createSquare();

        circle.draw();
        square.draw();

        colorChooser.setColor(Color.blue);

        Shape circle2 = chooser.getFactory().createCircle();
        Shape square2 = chooser.getFactory().createSquare();

        circle2.draw();
        square2.draw();

    }
}
