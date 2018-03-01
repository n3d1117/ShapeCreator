import java.util.Observable;

public class ColorChooser extends Observable {

    private Color color;

    public ColorChooser() {
        this.color = Color.red;
    }

    public void setColor(Color color) {
        this.color = color;
        setChanged();
        notifyObservers();
    }

    public Color getColor() {
        return color;
    }
}
