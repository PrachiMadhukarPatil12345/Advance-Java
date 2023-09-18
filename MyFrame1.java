import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame1 extends JFrame implements ActionListener {
  JProgressBar pb;
  JButton b1 = new JButton("LOGIN");

  MyFrame1() {
    setLayout(null);   
    pb = new JProgressBar(1, 100);
    pb.setValue(0);
    pb.setStringPainted(true);
    b1.setBounds(20, 20, 80, 25);
    pb.setBounds(110, 20, 200, 25);
    pb.setVisible(false);
    add(b1);
    add(pb);
    b1.addActionListener(this);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e) {
    int i = 0;
    if (e.getSource() == b1) {
      pb.setVisible(true);
      try {
        while (i <= 100) {
          Thread.sleep(50);
          pb.paintImmediately(0, 0, 200, 25);
          pb.setValue(i);
          i++;
        }
      } catch (Exception e1) {
        System.out.print("Caughted exception is =" + e1);
      }
    }
  }
}
public class Progress
 {
	 public static void main(String arg[]) {
     MyFrame1 m = new MyFrame1();
     m.setSize(330, 100);
     m.setVisible(true);
  }
}

