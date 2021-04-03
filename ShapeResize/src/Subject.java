import java.util.List;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Subject {
    List<Observer> observers = new ArrayList<Observer>();
    Observer display;
    private int percent;
    //private JFrame f;

    public int getPercent(){
        return percent;
    }
    public void setPercent(int percent){
        this.percent = percent;
        //this.f = f;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);		
    }  
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
        //display.display(f);
    }
}
