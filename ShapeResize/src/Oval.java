import java.awt.*;
public class Oval extends Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private double percent;

    //Constructor
    /*public Oval(int xVal, int yVal, int widthVal, int heightVal){
        x = xVal;
        y = yVal;
        width = widthVal;
        height = heightVal;
    }
    */
    public Oval(double percentVal){
        x = 500;
        y = 10;
        width = 120;
        height = 120;
        percent = percentVal;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        //g.drawOval(x, y, width, height);
        g.drawOval(x, y, (int)(width*percent), (int)(height*percent));
    }
}