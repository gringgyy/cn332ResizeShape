import java.util.List;
import javax.swing.JFrame;

public abstract class Observer {
    protected Subject subject;
    protected List<Shape> shapeArray;
    //private JFrame f;
    public abstract void update();
    /*
    public void display(JFrame fVal){
        this.f = fVal;
        for (Shape shape : shapeArray) {
            f.add(shape);
            f.setVisible(true);
        }
    }
    */
}
