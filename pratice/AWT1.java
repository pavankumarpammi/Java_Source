import java.awt.*;
import java.awt.Panel;
// class Button1 extends Frame{
//     Button b =new Button();
//     b.setBackground(30,100,80);

// }
public class AWT1 extends Frame {
    public static void main(String[] args) {
        Frame f =new Frame("Frame example");
        Panel p=new Panel( );
        f.resize(500, 500);
        p.resize(100,100);
        f.setBackground(Color.blue);
        f.setTitle("HEllO...");
        
        p.setBackground(Color.yellow);
        f.add(p);
        f.show();
        
    }
}
