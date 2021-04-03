import java.util.List;

public class OvalObserver extends Observer {

    public OvalObserver(Subject subject, List<Shape> shapeArray){
        this.subject = subject;
        this.shapeArray = shapeArray;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        Oval oval = new Oval(subject.getPercent()*0.01);
        shapeArray.add(oval);
    }
}
