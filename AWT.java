
import java.awt.*;

public class AWT extends Frame {

    public AWT() {
        setSize(500, 500);
        setTitle("My Frame");
        setBackground(Color.PINK);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g.drawString("HELLO! MAM.", 100, 100);
        g.fillRect(200, 200, 100, 100);
        
    }

    public static void main(String[] args) {
        AWT a = new AWT();
    }

}