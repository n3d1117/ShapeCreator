import java.util.Observable;
import java.util.Observer;

public class FactoryChooser implements Observer {

    private ShapeFactory factory;

    public ShapeFactory getFactory() {
        return factory;
    }

    FactoryChooser(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Color color = ((ColorChooser)o).getColor();
        System.out.println("Color was changed to " + color.toString() + "!");
        selectFactory(color);
    }

    private void selectFactory(Color color) {
        switch (color) {
            case red:
                factory = RedShapeFactory.getInstance();
                break;
            case green:
                factory = GreenShapeFactory.getInstance();
                break;
            case blue:
                factory = BlueShapeFactory.getInstance();
                break;
        }
    }
}
