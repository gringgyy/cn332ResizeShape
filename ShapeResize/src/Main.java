import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Subject subject = new Subject();
        List<Shape> shapeArray = new ArrayList<Shape>();
        boolean boo = true;
        
        new OvalObserver(subject,shapeArray);
        new RectangleObserver(subject,shapeArray);

        JFrame f = new JFrame("Shape");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200,850);
        subject.setPercent(100);
        for (Shape shape : shapeArray) {
            f.add(shape);
            f.setVisible(true);
        }
        while(boo){
            int inputPercent = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Percent"));
            if(inputPercent == 0){
                boo = false;
            }
            else {
                f.getContentPane().removeAll();
                f.getContentPane().repaint();
                shapeArray.clear();
                subject.setPercent(inputPercent);
                for (Shape shape : shapeArray) {
                    f.add(shape);
                    f.setVisible(true);
                }
                System.out.println(shapeArray.size());
            }
        }
    }
}
