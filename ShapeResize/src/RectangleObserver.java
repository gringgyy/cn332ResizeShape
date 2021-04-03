import java.util.List;

public class RectangleObserver extends Observer {
    public RectangleObserver(Subject subject, List<Shape> shapeArray){
        this.subject = subject;
        this.shapeArray = shapeArray;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        Rectangle rectangle = new Rectangle(subject.getPercent()*0.01);
        shapeArray.add(rectangle);
    }
    
}
