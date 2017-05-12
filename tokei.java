import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.JFrame;
import java.util.Timer;
import javax.swing.*;

public class tokei extends JFrame {

       public static void main(String[] args) {
              new tokei();
       }

       public tokei() {
              JFrame frame = new JFrame();
              JLabel label = new JLabel();
              frame.setBounds(200, 200, 300, 200);
              frame.setLayout(new BorderLayout());
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              label.setFont(Font("Dialog", Font.BOLD,24));
              frame.getContentPane().add(label,BorderLayout.CENTER);
              Timer t = new Timer();
              t.schedule(new MyTimer(),0,500);
              frame.setVisible(true);
       }

       class MyTimer extends TimerTask {
              boolean f = false;
              
              public void run(){
                     String delim = f ? ":" : " ";
                     f = !f;
                     String str = "hh" + delim + 
                                   "mm" + delim + "ss";
                     SimpleDateFormat sf =
                                   new SimpleDateFormat(str);
                     GregorianCalendar cal =
                                   new GregorianCalendar();
                     label.setText(sf.format(cal.getTime()));
              }
       }
}
