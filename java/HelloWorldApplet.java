import java.applet.*;
import java.awt.*;
/*<applet code="MyApplet" height="500" width="500"></applet>*/ 
public class MyApplet extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World", 25, 50);
   }
}