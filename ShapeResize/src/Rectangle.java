import java.awt.*;
public class Rectangle extends Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private double percent;

    //Constructor
    public Rectangle(int xVal, int yVal, int widthVal, int heightVal){
        x = xVal;
        y = yVal;
        width = widthVal;
        height = heightVal;
    }
    public Rectangle(double percentVal){
        x = 10;
        y = 10;
        width = 120;
        height = 120;
        percent = percentVal;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        //g.drawRect(x, y, width, height);
        g.drawRect(x, y, (int)(width*percent), (int)(height*percent));
    }
}
