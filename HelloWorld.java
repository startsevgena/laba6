/*
* <applet code="HelloWorld" width=200 height=100>
* </applet>
*
*/
import java.applet.*;
import java.awt.*;
public class HelloWorld extends Applet {
final Font f = new Font("Helvetica", Font.BOLD, 18);

public void paint(Graphics g) { 
Dimension d = this.size();
g.setColor(Color.white);
g.fillRect(0,0,d.width,d.height);
g.setColor(Color.black);
g.setFont(f);
drawCenteredString("125401", d.width, d.height, g);
g.drawRect(0,0,d.width-1,d.height-1);
}

public void drawCenteredString(String s, int w, int h, Graphics g) { 
FontMetrics fm = g.getFontMetrics();
int x = (w - fm.stringWidth(s)) / 2;
int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent()))/2);
g.drawString(s, x, y);
} }
