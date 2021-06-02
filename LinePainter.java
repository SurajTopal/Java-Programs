import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Liner extends JComponent
{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(200, 200);
        Random generator = new Random();
        for(int i=1; i<=100; i++){
            int linewidth = generator.nextInt(10);
            g2d.setStroke(new BasicStroke(linewidth));
            g2d.setColor(new Color(generator.nextInt(256),generator.nextInt(256), generator.nextInt(256)));
            double xCord = -200 + generator.nextDouble()*400;
            double yCord = -200 + generator.nextDouble()*400;
            Line2D.Double line = new Line2D.Double(0, 0, xCord, yCord);
            g2d.draw(line);
        }
    }
}

public class LinePainter extends JFrame
{
    Liner canvas = new Liner();
    public LinePainter(){
        setSize(400, 400);
        setVisible(true);
        add(canvas);
    }
    
    
    public static void main(String[] args){
        LinePainter app = new LinePainter();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}